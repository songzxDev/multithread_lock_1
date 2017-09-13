/**   
* @Title: MyReentrantLockService.java 
* @Package cn.songzx.multithreadlock.reentrantlock.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����8:55:47 
* @version V1.0   
*/
package cn.songzx.multithreadlock.reentrantlock.service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyReentrantLockService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����8:55:47
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
