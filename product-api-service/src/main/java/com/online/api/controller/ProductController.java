/**
 * 
 */
package com.online.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/getProduct")
	public String getProduct() {
		return "product";
	}
}
