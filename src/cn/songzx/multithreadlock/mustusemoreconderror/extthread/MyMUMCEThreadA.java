/**   
* @Title: MyMUMCEThreadA.java 
* @Package cn.songzx.multithreadlock.mustusemoreconderror.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����11:34:24 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemoreconderror.extthread;

import cn.songzx.multithreadlock.mustusemoreconderror.service.MyMUMCEService;

/**
 * @ClassName: MyMUMCEThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����11:34:24
 * 
 */
public class MyMUMCEThreadA extends Thread {

	private MyMUMCEService service;

	/**
	 * @Date: 2017��9��16������11:35:13
	 * @Title: MyMUMCEThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyMUMCEThreadA(MyMUMCEService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.awaitA();
	}
}
