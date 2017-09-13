/**   
* @Title: MyReentrantLockRun.java 
* @Package cn.songzx.multithreadlock.reentrantlock.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午9:01:50 
* @version V1.0   
*/
package cn.songzx.multithreadlock.reentrantlock.test;

import cn.songzx.multithreadlock.reentrantlock.extthread.MyReentrantLockThreadA;
import cn.songzx.multithreadlock.reentrantlock.service.MyReentrantLockService;

/**
 * @ClassName: MyReentrantLockRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午9:01:50
 * 
 */
public class MyReentrantLockRun {

	/**
	 * @Date: 2017年9月13日下午9:01:50
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyReentrantLockService service = new MyReentrantLockService();
		MyReentrantLockThreadA t1 = new MyReentrantLockThreadA(service);
		MyReentrantLockThreadA t2 = new MyReentrantLockThreadA(service);
		MyReentrantLockThreadA t3 = new MyReentrantLockThreadA(service);
		MyReentrantLockThreadA t4 = new MyReentrantLockThreadA(service);
		MyReentrantLockThreadA t5 = new MyReentrantLockThreadA(service);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
