package com.ms.db;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to DB Rest Controller..";
	}
}
