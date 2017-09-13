/**   
* @Title: MyCondWNERunTest.java 
* @Package cn.songzx.multithreadlock.condwaitnotifyerror.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午10:05:39 
* @version V1.0   
*/
package cn.songzx.multithreadlock.condwaitnotifyerror.test;

import cn.songzx.multithreadlock.condwaitnotifyerror.extthread.MyCondWNEThreadA;
import cn.songzx.multithreadlock.condwaitnotifyerror.extthread.MyCondWNOKThreadA;
import cn.songzx.multithreadlock.condwaitnotifyerror.service.MyCondWNEService;
import cn.songzx.multithreadlock.condwaitnotifyerror.service.MyCondWNOKService;

/**
 * @ClassName: MyCondWNERunTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午10:05:39
 * 
 */
public class MyCondWNERunTest {

	/**
	 * @Date: 2017年9月13日下午10:05:39
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyCondWNEService service = new MyCondWNEService();

			MyCondWNEThreadA a = new MyCondWNEThreadA(service);
			a.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		MyCondWNOKService serviceOk = new MyCondWNOKService();
		MyCondWNOKThreadA aOk = new MyCondWNOKThreadA(serviceOk);
		aOk.start();
	}

}
