/**   
* @Title: MyReentrantLockThreadA.java 
* @Package cn.songzx.multithreadlock.reentrantlock.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����9:00:23 
* @version V1.0   
*/
package cn.songzx.multithreadlock.reentrantlock.extthread;

import cn.songzx.multithreadlock.reentrantlock.service.MyReentrantLockService;

/**
 * @ClassName: MyReentrantLockThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����9:00:23
 * 
 */
public class MyReentrantLockThreadA extends Thread {

	private MyReentrantLockService service;

	/**
	 * @Date: 2017��9��13������9:01:01
	 * @Title: MyReentrantLockThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyReentrantLockThreadA(MyReentrantLockService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
