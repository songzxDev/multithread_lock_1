/**   
* @Title: MyMUMCOKThreadA.java 
* @Package cn.songzx.multithreadlock.mustusemorecondok.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����1:39:35 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemorecondok.extthread;

import cn.songzx.multithreadlock.mustusemorecondok.service.MyMUMCOKService;

/**
 * @ClassName: MyMUMCOKThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����1:39:35
 * 
 */
public class MyMUMCOKThreadA extends Thread {

	private MyMUMCOKService service;

	/**
	 * @Date: 2017��9��16������1:40:02
	 * @Title: MyMUMCOKThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyMUMCOKThreadA(MyMUMCOKService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.awaitB();
	}
}
