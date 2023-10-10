/**
 * 
 */
package com.online.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 */

@SpringBootApplication(scanBasePackages = "com.online")
public class OrderAPIApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderAPIApplication.class, args);
	}
}
