/**   
* @Title: MyReentrantLockThreadA.java 
* @Package cn.songzx.multithreadlock.reentrantlock.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午9:00:23 
* @version V1.0   
*/
package cn.songzx.multithreadlock.reentrantlock.extthread;

import cn.songzx.multithreadlock.reentrantlock.service.MyReentrantLockService;

/**
 * @ClassName: MyReentrantLockThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午9:00:23
 * 
 */
public class MyReentrantLockThreadA extends Thread {

	private MyReentrantLockService service;

	/**
	 * @Date: 2017年9月13日下午9:01:01
	 * @Title: MyReentrantLockThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
