package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	@GetMapping("/getPrice")
	float getPrice() {
		return 1000;
	}

}
