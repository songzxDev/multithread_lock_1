/**   
* @Title: MyConWNOKRunTest.java 
* @Package cn.songzx.multithreadlock.conwnok.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����10:21:22 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conwnok.test;

import cn.songzx.multithreadlock.conwnok.extthread.MyConWNOKThreadA;
import cn.songzx.multithreadlock.conwnok.service.MyConWNOkService;

/**
 * @ClassName: MyConWNOKRunTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����10:21:22
 * 
 */
public class MyConWNOKRunTest {

	/**
	 * @Date: 2017��9��13������10:21:22
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyConWNOkService service = new MyConWNOkService();
			MyConWNOKThreadA a = new MyConWNOKThreadA(service);
			a.start();
			Thread.sleep(3000);
			service.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
