package com.cgasync;

import java.util.concurrent.Future;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cgasync.service.AsyncServices;

@SpringBootApplication
public class SpringAsyncApplication implements CommandLineRunner {

	@Resource
	AsyncServices services;

	Logger log = LoggerFactory.getLogger(this.getClass().getName());

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncApplication.class, args).close();;
	}

	@Override
	public void run(String... args) throws Exception {
		Future<String> processone = services.process();
		Future<String> processtwo = services.process();
		Future<String> processthree = services.process();
		Future<String> processfour = services.notAsyncMethod();

		
		// Wait until all processes are Done
		// If all are not Done. Pause 5s for next re-check
		while (!(processone.isDone() && processtwo.isDone() && processthree.isDone() && processfour.isDone())) {
			Thread.sleep(5000);
		
		}
		
		log.info("All Processes are DONE!");
		
		// Log results
		log.info("Process 1: " + processone.get());
		log.info("Process 2: " + processtwo.get());
		log.info("Process 3: " + processthree.get());
		log.info("Process 4: " + processfour.get());
		
	}
}
