package com.ProducerConsumer.producer;

import java.util.List;

public class Producer implements Runnable {
	
	private List<Integer> sharedQueue;
	private int maxSize = 3;
	
	public Producer(final List<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i =0 ; i< 10 ; i ++) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method will produce 10 items and add it to the queue.
	 * @param i
	 * @throws InterruptedException 
	 */
	private void produce(int i) throws InterruptedException {
		
		synchronized (sharedQueue) {
			while (sharedQueue.size() == maxSize) {
				System.out.println("Queue is full, produce Thread is waiting for Consumer thread to consume. Queue size is: " + sharedQueue.size());
				sharedQueue.wait();
			}
			//outside this block means queue is not full, place item in queue.
			System.out.println("Produced item " + i);
			sharedQueue.add(i);
			Thread.sleep((long)(Math.random() * 1000));
			//added the item in the queue notify now
			sharedQueue.notify();
		}
	}
}
