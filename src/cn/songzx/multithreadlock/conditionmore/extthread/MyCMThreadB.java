/**   
* @Title: MyCMThreadA.java 
* @Package cn.songzx.multithreadlock.conditionmore.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午9:13:03 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conditionmore.extthread;

import cn.songzx.multithreadlock.conditionmore.service.MyConditionMoreService;

/**
 * @ClassName: MyCMThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午9:13:03
 * 
 */
public class MyCMThreadB extends Thread {

	private MyConditionMoreService service;

	/**
	 * @Date: 2017年9月13日下午9:14:17
	 * @Title: MyCMThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyCMThreadB(MyConditionMoreService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.methodB();
	}

}
