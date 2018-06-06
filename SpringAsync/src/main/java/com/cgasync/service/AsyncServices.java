package com.cgasync.service;

import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service
public class AsyncServices {
	
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	@Async
    public Future<String> process() throws InterruptedException {
		
		log.info("Start Processing with Thread id: " + Thread.currentThread().getId());
		
		// Sleep for 3s  
		Thread.sleep(3000);
		
		String processInfo = String.format("Processing is Done with Thread id= %d", Thread.currentThread().getId());
        return new AsyncResult<String>(processInfo);
    }
	
	public Future<String> notAsyncMethod() throws InterruptedException
	{
		log.info("Start Processing with Thread id: " + Thread.currentThread().getId());
		
		// Sleep for 3s  
		Thread.sleep(3000);
		
		String process = String.format("I am not Async Method and processing is done with Thread Id = %d",Thread.currentThread().getId());
		return new AsyncResult<String>(process);
	}
	
}