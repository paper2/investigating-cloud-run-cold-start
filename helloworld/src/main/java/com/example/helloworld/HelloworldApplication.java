package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

	@Value("${NAME:World}")
	String name;

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "Hello " + name + "!";
		}

		@GetMapping("/sleep")
		Void sleep() {
			try {
				int sleepTime = 1;
				System.out.println("Sleeping for " + sleepTime + " seconds");
				Thread.sleep(sleepTime * 1000);
				System.out.println("Done sleeping");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

	public static void main(String[] args) {
		try {
			int sleepTime = 60;
			System.out.println("Sleeping for " + sleepTime + " seconds");
			Thread.sleep(sleepTime * 1000);
			System.out.println("Done sleeping");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
