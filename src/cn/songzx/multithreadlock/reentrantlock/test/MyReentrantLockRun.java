/**   
* @Title: MyReentrantLockRun.java 
* @Package cn.songzx.multithreadlock.reentrantlock.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����9:01:50 
* @version V1.0   
*/
package cn.songzx.multithreadlock.reentrantlock.test;

import cn.songzx.multithreadlock.reentrantlock.extthread.MyReentrantLockThreadA;
import cn.songzx.multithreadlock.reentrantlock.service.MyReentrantLockService;

/**
 * @ClassName: MyReentrantLockRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����9:01:50
 * 
 */
public class MyReentrantLockRun {

	/**
	 * @Date: 2017��9��13������9:01:50
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
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
