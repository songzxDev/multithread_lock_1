/**   
* @Title: MyConWNOKThreadA.java 
* @Package cn.songzx.multithreadlock.conwnok.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����10:19:19 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conwnok.extthread;

import cn.songzx.multithreadlock.conwnok.service.MyConWNOkService;

/**
 * @ClassName: MyConWNOKThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����10:19:19
 * 
 */
public class MyConWNOKThreadA extends Thread {

	private MyConWNOkService service;

	/**
	 * @Date: 2017��9��13������10:20:01
	 * @Title: MyConWNOKThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyConWNOKThreadA(MyConWNOkService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.await();
	}
}
