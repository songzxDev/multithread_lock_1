/**   
* @Title: MyMUMCERunTest.java 
* @Package cn.songzx.multithreadlock.mustusemoreconderror.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����11:36:42 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemoreconderror.test;

import cn.songzx.multithreadlock.mustusemoreconderror.extthread.MyMUMCEThreadA;
import cn.songzx.multithreadlock.mustusemoreconderror.extthread.MyMUMCEThreadB;
import cn.songzx.multithreadlock.mustusemoreconderror.service.MyMUMCEService;

/**
 * @ClassName: MyMUMCERunTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����11:36:42
 * 
 */
public class MyMUMCERunTest {

	/**
	 * @Date: 2017��9��16������11:36:42
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
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
