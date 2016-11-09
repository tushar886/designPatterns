package com.ProducerConsumer.client;

import java.util.LinkedList;
import java.util.List;

import com.ProducerConsumer.consumer.Consumer;
import com.ProducerConsumer.producer.Producer;

public class ProducerConsumerClient {

	public static void main(String[] args) {

		List<Integer> sharedQueue = new LinkedList<Integer>(); //Creating shared object

		Producer producer=new Producer(sharedQueue);
		Consumer consumer=new Consumer(sharedQueue);

		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");
		
		producerThread.start();
		consumerThread.start();
	}
}
