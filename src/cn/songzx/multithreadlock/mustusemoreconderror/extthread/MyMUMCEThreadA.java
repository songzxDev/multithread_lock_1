/**   
* @Title: MyMUMCEThreadA.java 
* @Package cn.songzx.multithreadlock.mustusemoreconderror.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 上午11:34:24 
* @version V1.0   
*/
package cn.songzx.multithreadlock.mustusemoreconderror.extthread;

import cn.songzx.multithreadlock.mustusemoreconderror.service.MyMUMCEService;

/**
 * @ClassName: MyMUMCEThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 上午11:34:24
 * 
 */
public class MyMUMCEThreadA extends Thread {

	private MyMUMCEService service;

	/**
	 * @Date: 2017年9月16日上午11:35:13
	 * @Title: MyMUMCEThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
