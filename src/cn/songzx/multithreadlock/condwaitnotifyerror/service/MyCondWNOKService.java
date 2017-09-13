/**   
* @Title: MyCondWNEService.java 
* @Package cn.songzx.multithreadlock.condwaitnotifyerror.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午10:01:12 
* @version V1.0   
*/
package cn.songzx.multithreadlock.condwaitnotifyerror.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyCondWNEService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午10:01:12
 * 
 */
public class MyCondWNOKService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void awaitMethod() {
		try {
			lock.lock();
			System.out.println("已经锁了！");
			condition.await();
			System.out.println("等待中......");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("释放锁了！");
		}
	}
}
