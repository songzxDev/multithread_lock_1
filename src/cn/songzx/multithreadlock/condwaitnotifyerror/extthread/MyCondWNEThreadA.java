/**   
* @Title: MyCondWNEThreadA.java 
* @Package cn.songzx.multithreadlock.condwaitnotifyerror.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����10:04:23 
* @version V1.0   
*/
package cn.songzx.multithreadlock.condwaitnotifyerror.extthread;

import cn.songzx.multithreadlock.condwaitnotifyerror.service.MyCondWNEService;

/**
 * @ClassName: MyCondWNEThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����10:04:23
 * 
 */
public class MyCondWNEThreadA extends Thread {

	private MyCondWNEService service;

	/**
	 * @Date: 2017��9��13������10:04:51
	 * @Title: MyCondWNEThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyCondWNEThreadA(MyCondWNEService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.await();
	}
}
