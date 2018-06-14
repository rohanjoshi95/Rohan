package com.rabbit.service;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;
@Component
public class Reciever {

	CountDownLatch latch = new CountDownLatch(1);
	
	public void recieverMassage(String message)
	{
		System.out.println("Recieved---> " + message);
		latch.countDown();
	}
	
	public CountDownLatch getLatch()
	{
		return latch;
	}
}
