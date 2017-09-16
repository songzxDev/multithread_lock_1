package cn.songzx.multithreadlock.mustusemoreconderror.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @ClassName: MyMUMCEService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����11:25:53
 *
 */
public class MyMUMCEService {
	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitA ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitB ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitB ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll() {
		try {
			lock.lock();
			System.out.println("  signalAll ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
