/**   
* @Title: MyConWNOkService.java 
* @Package cn.songzx.multithreadlock.conwnok 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午10:14:43 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conwnok.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyConWNOkService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午10:14:43
 * 
 */
public class MyConWNOkService {

	private Lock lock = new ReentrantLock();

	public Condition condition = lock.newCondition();

	public void await() {
		try {
			lock.lock();
			System.out.println(" await 时间为：" + System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signal() {
		try {
			lock.lock();
			System.out.println(" signal 时间为：" + System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
