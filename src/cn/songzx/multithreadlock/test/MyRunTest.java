/**   
* @Title: MyRunTest.java 
* @Package cn.songzx.multithreadlock.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����2:03:21 
* @version V1.0   
*/
package cn.songzx.multithreadlock.test;

import cn.songzx.multithreadlock.extthread.MyThreadA;
import cn.songzx.multithreadlock.extthread.MyThreadB;
import cn.songzx.multithreadlock.service.MyServiceB;

/**
 * @ClassName: MyRunTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����2:03:21
 * 
 */
public class MyRunTest {

	/**
	 * @Date: 2017��9��16������2:03:21
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyServiceB service = new MyServiceB();
		MyThreadA[] a = new MyThreadA[10];
		MyThreadB[] b = new MyThreadB[10];
		for (int i = 0; i < 100; i++) {
			a[i] = new MyThreadA(service);
			b[i] = new MyThreadB(service);
			a[i].start();
			b[i].start();
		}
	}

}
