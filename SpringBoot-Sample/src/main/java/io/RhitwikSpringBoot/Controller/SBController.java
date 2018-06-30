package io.RhitwikSpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

	@RequestMapping
	public String sayGreet() {
		return "Welcome to Rhitwik's Spring Boot Application Response !!";
	}
}
