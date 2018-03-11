package org.uday.tutorials;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrinterThread extends Thread {
	String nm;

	public void setNm(String name){
		this.nm = name;
	}


	@Override
	public void run() {
		System.out.println(nm + " is running");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nm + " -is running");
	}
}
