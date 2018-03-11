package org.uday.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.uday.tutorials.PrinterThread;

import com.uday.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) ctx.getBean("taskExecutor");
		
		PrinterThread printThread = (PrinterThread) ctx.getBean("printerThread");
		printThread.setNm("Thread 1");
		taskExecutor.execute(printThread);
		
		PrinterThread printThread2 = (PrinterThread) ctx.getBean("printerThread");
		printThread2.setNm("Thread 2");
		taskExecutor.execute(printThread2);
		
		PrinterThread printThread3 = (PrinterThread) ctx.getBean("printerThread");
		printThread3.setNm("Thread 3");
		taskExecutor.execute(printThread3);
		
		PrinterThread printThread4 = (PrinterThread) ctx.getBean("printerThread");
		printThread4.setNm("Thread 4");
		taskExecutor.execute(printThread4);
		
		PrinterThread printThread5 = (PrinterThread) ctx.getBean("printerThread");
		printThread5.setNm("Thread 5");
		taskExecutor.execute(printThread5);
		
		PrinterThread printThread6 = (PrinterThread) ctx.getBean("printerThread");
		printThread6.setNm("Thread 6");
		taskExecutor.execute(printThread6);
		
		for(;;) {
			int count = taskExecutor.getActiveCount();
			System.out.println("Active threads: " + count);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
			if(count == 0) {
				taskExecutor.shutdown();
				break;
			}
		}
			
	}
}
