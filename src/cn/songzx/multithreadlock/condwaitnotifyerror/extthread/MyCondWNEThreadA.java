/**   
* @Title: MyCondWNEThreadA.java 
* @Package cn.songzx.multithreadlock.condwaitnotifyerror.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午10:04:23 
* @version V1.0   
*/
package cn.songzx.multithreadlock.condwaitnotifyerror.extthread;

import cn.songzx.multithreadlock.condwaitnotifyerror.service.MyCondWNEService;

/**
 * @ClassName: MyCondWNEThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午10:04:23
 * 
 */
public class MyCondWNEThreadA extends Thread {

	private MyCondWNEService service;

	/**
	 * @Date: 2017年9月13日下午10:04:51
	 * @Title: MyCondWNEThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
