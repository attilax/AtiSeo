/**
 * 
 */
package com.attilax;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.attilax.io.pathx;
import com.attilax.text.strUtil;

/**
 * @author ASIMO
 * 
 */
public class aa {

	public static void main(String[] args) throws InterruptedException {
		// java.sql.Timestamp time = new java.sql.Timestamp(new
		// java.util.Date().getTime());
		//
		// int sk = time.getSeconds();
		// if(sk<30)
		// return "e";
		// System.out.println(sk);//秒
		 String f2=pathx.webAppPath()+"\\"+"aa/oo.mp";
		 f2=f2.replaceAll(strUtil.slashChar , strUtil.backslashChar );
		//aa();
		System.out.println(f2);
		System.out.println("---");

	}

	private static void aa() throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(3);
		//core.execMeth_Ays(runnable, threadName)
		for (int i = 0; i <10000; i++) {
			final int idx=i;
			es.execute(new Runnable() {

				@Override
				public void run() {
					System.out.println(idx);

				}
			});
			Thread.sleep(1*1000);
		}
	}
}
