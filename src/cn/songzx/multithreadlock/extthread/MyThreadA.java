/**   
* @Title: MyThreadA.java 
* @Package cn.songzx.multithreadlock.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午2:01:44 
* @version V1.0   
*/
package cn.songzx.multithreadlock.extthread;

import cn.songzx.multithreadlock.service.MyService;

/**
 * @ClassName: MyThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午2:01:44
 * 
 */
public class MyThreadA extends Thread {

	private MyService service;

	/**
	 * @Date: 2017年9月16日下午2:02:08
	 * @Title: MyThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
