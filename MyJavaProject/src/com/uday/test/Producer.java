package com.uday.test;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			Message msg = new Message(""+i);
			try {
				Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Produced::" +msg.getMsg());
			} catch(InterruptedException e) {
				
			}
		}
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch(InterruptedException e) {
			
		}
	}

}
