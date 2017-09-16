/**   
* @Title: MyMUMCOKService.java 
* @Package cn.songzx.multithreadlock.mustusemorecondok.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����11:45:29 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemorecondok.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyMUMCOKService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����11:45:29
 * 
 */
public class MyMUMCOKService {
	private Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionA.await();
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
			conditionB.await();
			System.out.println("  end awaitB ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll_A() {
		try {
			lock.lock();
			System.out.println("  signalAll_A ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll_B() {
		try {
			lock.lock();
			System.out.println("  signalAll_B ʱ��Ϊ��" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionB.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
