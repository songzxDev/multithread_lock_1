/**   
* @Title: MyConWNOKThreadA.java 
* @Package cn.songzx.multithreadlock.conwnok.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午10:19:19 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conwnok.extthread;

import cn.songzx.multithreadlock.conwnok.service.MyConWNOkService;

/**
 * @ClassName: MyConWNOKThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午10:19:19
 * 
 */
public class MyConWNOKThreadA extends Thread {

	private MyConWNOkService service;

	/**
	 * @Date: 2017年9月13日下午10:20:01
	 * @Title: MyConWNOKThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
