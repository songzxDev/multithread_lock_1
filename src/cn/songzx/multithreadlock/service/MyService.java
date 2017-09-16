/**   
* @Title: MyService.java 
* @Package cn.songzx.multithreadlock.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����1:54:51 
* @version V1.0   
*/
package cn.songzx.multithreadlock.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����1:54:51
 * 
 */
public class MyService {
	private ReentrantLock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	private boolean hasValue = false;

	public void set() {
		try {
			lock.lock();
			while (hasValue == true) {
				condition.await();
			}
			System.out.println("��ӡ �� ");
			hasValue = true;
			condition.signal();
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
				condition.await();
			}
			System.out.println("��ӡ �� ");
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
