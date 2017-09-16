package cn.songzx.multithreadlock.mustusemoreconderror.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @ClassName: MyMUMCEService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 上午11:25:53
 *
 */
public class MyMUMCEService {
	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.await();
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
			condition.await();
			System.out.println("  end awaitB 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll() {
		try {
			lock.lock();
			System.out.println("  signalAll 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
