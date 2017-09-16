/**   
* @Title: MyMUMCOKService.java 
* @Package cn.songzx.multithreadlock.mustusemorecondok.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 上午11:45:29 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemorecondok.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyMUMCOKService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 上午11:45:29
 * 
 */
public class MyMUMCOKService {
	private Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionA.await();
			System.out.println("  end awaitA 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitB 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionB.await();
			System.out.println("  end awaitB 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll_A() {
		try {
			lock.lock();
			System.out.println("  signalAll_A 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll_B() {
		try {
			lock.lock();
			System.out.println("  signalAll_B 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionB.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
