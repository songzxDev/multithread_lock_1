/**   
* @Title: MyConditionMoreService.java 
* @Package cn.songzx.multithreadlock.conditionmore.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午9:08:03 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conditionmore.service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyConditionMoreService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午9:08:03
 * 
 */
public class MyConditionMoreService {

	private Lock lock = new ReentrantLock();

	public void methodA() {
		try {
			lock.lock();
			System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodA   end ThreadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void methodB() {
		try {
			lock.lock();
			System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodB   end ThreadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
