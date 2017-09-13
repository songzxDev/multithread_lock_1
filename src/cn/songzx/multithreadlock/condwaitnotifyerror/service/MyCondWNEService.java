/**   
* @Title: MyCondWNEService.java 
* @Package cn.songzx.multithreadlock.condwaitnotifyerror.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����10:01:12 
* @version V1.0   
*/
package cn.songzx.multithreadlock.condwaitnotifyerror.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyCondWNEService
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����10:01:12
 * 
 */
public class MyCondWNEService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
