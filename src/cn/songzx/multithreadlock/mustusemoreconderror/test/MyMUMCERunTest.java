/**   
* @Title: MyMUMCERunTest.java 
* @Package cn.songzx.multithreadlock.mustusemoreconderror.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 上午11:36:42 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemoreconderror.test;

import cn.songzx.multithreadlock.mustusemoreconderror.extthread.MyMUMCEThreadA;
import cn.songzx.multithreadlock.mustusemoreconderror.extthread.MyMUMCEThreadB;
import cn.songzx.multithreadlock.mustusemoreconderror.service.MyMUMCEService;

/**
 * @ClassName: MyMUMCERunTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 上午11:36:42
 * 
 */
public class MyMUMCERunTest {

	/**
	 * @Date: 2017年9月16日上午11:36:42
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyMUMCEService service = new MyMUMCEService();
			MyMUMCEThreadA a = new MyMUMCEThreadA(service);
			a.setName("MyMUMCEThreadA");
			a.start();
			MyMUMCEThreadB b = new MyMUMCEThreadB(service);
			b.setName("MyMUMCEThreadB");
			b.start();
			Thread.sleep(3000L);
			service.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
