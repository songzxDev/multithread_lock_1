/**   
* @Title: MyCMRun.java 
* @Package cn.songzx.multithreadlock.conditionmore.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��13�� ����9:16:10 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conditionmore.test;

import cn.songzx.multithreadlock.conditionmore.extthread.MyCMThreadA;
import cn.songzx.multithreadlock.conditionmore.extthread.MyCMThreadAA;
import cn.songzx.multithreadlock.conditionmore.extthread.MyCMThreadB;
import cn.songzx.multithreadlock.conditionmore.extthread.MyCMThreadBB;
import cn.songzx.multithreadlock.conditionmore.service.MyConditionMoreService;

/**
 * @ClassName: MyCMRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��13�� ����9:16:10
 * 
 */
public class MyCMRun {

	/**
	 * @Date: 2017��9��13������9:16:10
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyConditionMoreService service = new MyConditionMoreService();

			MyCMThreadA a = new MyCMThreadA(service);
			a.setName("A");
			a.start();
			MyCMThreadAA aa = new MyCMThreadAA(service);
			aa.setName("AA");
			aa.start();
			Thread.sleep(100);
			MyCMThreadB b = new MyCMThreadB(service);
			b.setName("B");
			b.start();
			MyCMThreadBB bb = new MyCMThreadBB(service);
			bb.setName("BB");
			bb.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
