/**   
* @Title: MyThreadA.java 
* @Package cn.songzx.multithreadlock.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����2:01:44 
* @version V1.0   
*/
package cn.songzx.multithreadlock.extthread;

import cn.songzx.multithreadlock.service.MyService;

/**
 * @ClassName: MyThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����2:01:44
 * 
 */
public class MyThreadA extends Thread {

	private MyService service;

	/**
	 * @Date: 2017��9��16������2:02:08
	 * @Title: MyThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyThreadA(MyService service) {
		super();
		this.service = service;
	}

	public void run() {
		while (true) {
			service.set();
		}
	}

}
