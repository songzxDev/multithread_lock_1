/**   
* @Title: MyService.java 
* @Package cn.songzx.multithreadlock.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午1:54:51 
* @version V1.0   
*/
package cn.songzx.multithreadlock.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午1:54:51
 * 
 */
public class MyServiceB extends MyService{
	private ReentrantLock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	private boolean hasValue = false;

	public void set() {
		try {
			lock.lock();
			while (hasValue == true) {
				System.out.println("有可能 ◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆ 连续");
				condition.await();
			}
			System.out.println("打印 ★ ");
			hasValue = true;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void get() {
		try {
			lock.lock();
			while (hasValue == false) {
				System.out.println("有可能 ◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇ 连续");
				condition.await();
			}
			System.out.println("打印 ☆ ");
			hasValue = false;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
