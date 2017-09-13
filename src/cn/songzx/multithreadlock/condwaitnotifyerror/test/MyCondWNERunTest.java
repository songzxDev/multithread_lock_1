/**   
* @Title: MyCondWNERunTest.java 
* @Package cn.songzx.multithreadlock.condwaitnotifyerror.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����10:05:39 
* @version V1.0   
*/
package cn.songzx.multithreadlock.condwaitnotifyerror.test;

import cn.songzx.multithreadlock.condwaitnotifyerror.extthread.MyCondWNEThreadA;
import cn.songzx.multithreadlock.condwaitnotifyerror.extthread.MyCondWNOKThreadA;
import cn.songzx.multithreadlock.condwaitnotifyerror.service.MyCondWNEService;
import cn.songzx.multithreadlock.condwaitnotifyerror.service.MyCondWNOKService;

/**
 * @ClassName: MyCondWNERunTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����10:05:39
 * 
 */
public class MyCondWNERunTest {

	/**
	 * @Date: 2017��9��13������10:05:39
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyCondWNEService service = new MyCondWNEService();

			MyCondWNEThreadA a = new MyCondWNEThreadA(service);
			a.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		MyCondWNOKService serviceOk = new MyCondWNOKService();
		MyCondWNOKThreadA aOk = new MyCondWNOKThreadA(serviceOk);
		aOk.start();
	}

}
