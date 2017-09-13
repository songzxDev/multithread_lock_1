/**   
* @Title: MyConWNOKRunTest.java 
* @Package cn.songzx.multithreadlock.conwnok.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月13日 下午10:21:22 
* @version V1.0   
*/
package cn.songzx.multithreadlock.conwnok.test;

import cn.songzx.multithreadlock.conwnok.extthread.MyConWNOKThreadA;
import cn.songzx.multithreadlock.conwnok.service.MyConWNOkService;

/**
 * @ClassName: MyConWNOKRunTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月13日 下午10:21:22
 * 
 */
public class MyConWNOKRunTest {

	/**
	 * @Date: 2017年9月13日下午10:21:22
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyConWNOkService service = new MyConWNOkService();
			MyConWNOKThreadA a = new MyConWNOKThreadA(service);
			a.start();
			Thread.sleep(3000);
			service.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
