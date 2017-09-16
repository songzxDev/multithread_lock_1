/**   
* @Title: MyMUMCOKRunTest.java 
* @Package cn.songzx.multithreadlock.mustusemorecondok.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����1:41:02 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemorecondok.test;

import cn.songzx.multithreadlock.mustusemorecondok.extthread.MyMUMCOKThreadA;
import cn.songzx.multithreadlock.mustusemorecondok.extthread.MyMUMCOKThreadB;
import cn.songzx.multithreadlock.mustusemorecondok.service.MyMUMCOKService;

/**
 * @ClassName: MyMUMCOKRunTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����1:41:02
 * 
 */
public class MyMUMCOKRunTest {

	/**
	 * @Date: 2017��9��16������1:41:02
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyMUMCOKService service = new MyMUMCOKService();
			MyMUMCOKThreadA a = new MyMUMCOKThreadA(service);
			a.setName("MyMUMCOKThreadA");
			a.start();
			MyMUMCOKThreadB b = new MyMUMCOKThreadB(service);
			b.setName("MyMUMCOKThreadB");
			b.start();
			Thread.sleep(3000L);
			service.signalAll_A();
			Thread.sleep(3000L);
			service.signalAll_B();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
