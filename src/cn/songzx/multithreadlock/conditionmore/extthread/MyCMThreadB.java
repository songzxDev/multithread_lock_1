/**   
* @Title: MyCMThreadA.java 
* @Package cn.songzx.multithreadlock.conditionmore.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����9:13:03 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conditionmore.extthread;

import cn.songzx.multithreadlock.conditionmore.service.MyConditionMoreService;

/**
 * @ClassName: MyCMThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����9:13:03
 * 
 */
public class MyCMThreadB extends Thread {

	private MyConditionMoreService service;

	/**
	 * @Date: 2017��9��13������9:14:17
	 * @Title: MyCMThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
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
