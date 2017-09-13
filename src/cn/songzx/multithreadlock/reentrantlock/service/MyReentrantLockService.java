/**   
* @Title: MyReentrantLockService.java 
* @Package cn.songzx.multithreadlock.reentrantlock.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午8:55:47 
* @version V1.0   
*/
package cn.songzx.multithreadlock.reentrantlock.service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyReentrantLockService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午8:55:47
 * 
 */
public class MyReentrantLockService {

	private Lock lock = new ReentrantLock();

	public void testMethod() {
		lock.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
		}
		lock.unlock();
	}

}
