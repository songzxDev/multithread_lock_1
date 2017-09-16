/**   
* @Title: MyRunTest.java 
* @Package cn.songzx.multithreadlock.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午2:03:21 
* @version V1.0   
*/
package cn.songzx.multithreadlock.test;

import cn.songzx.multithreadlock.extthread.MyThreadA;
import cn.songzx.multithreadlock.extthread.MyThreadB;
import cn.songzx.multithreadlock.service.MyServiceB;

/**
 * @ClassName: MyRunTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午2:03:21
 * 
 */
public class MyRunTest {

	/**
	 * @Date: 2017年9月16日下午2:03:21
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
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
