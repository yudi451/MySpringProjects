package com.uday.test;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	
	@Override
	public void run() {
		try {
			Message msg;
			while((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(10);
				System.out.println("Consumed::" +msg.getMsg());
			}
		} catch(InterruptedException e) {
			
		}
	}

}
