package com.ProducerConsumer.consumer;

import java.util.List;

public class Consumer implements Runnable {

	private List<Integer> sharedQueue;
	
	public Consumer(final List<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		
		//in infinite loop consume the data.
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		
		synchronized (sharedQueue) {
			while (sharedQueue.size() == 0) {
				System.out.println("Consumer is waiting for producer. Shared queue is empty: " + sharedQueue.size());
				sharedQueue.wait();
			}
			
			//sleep for some time and then consume.
			Thread.sleep((long)(Math.random() * 2000));
			System.out.println("Consumed: " + sharedQueue.remove(0));
			sharedQueue.notify();
		}
	}
}
