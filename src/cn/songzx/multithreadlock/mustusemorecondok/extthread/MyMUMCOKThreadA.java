/**   
* @Title: MyMUMCOKThreadA.java 
* @Package cn.songzx.multithreadlock.mustusemorecondok.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午1:39:35 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemorecondok.extthread;

import cn.songzx.multithreadlock.mustusemorecondok.service.MyMUMCOKService;

/**
 * @ClassName: MyMUMCOKThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午1:39:35
 * 
 */
public class MyMUMCOKThreadA extends Thread {

	private MyMUMCOKService service;

	/**
	 * @Date: 2017年9月16日下午1:40:02
	 * @Title: MyMUMCOKThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
