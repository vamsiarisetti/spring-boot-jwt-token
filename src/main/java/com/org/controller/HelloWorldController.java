package com.org.controller;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Api(value = "Hello world Endpoint to validate JWT token authentication")
//@SecurityRequirement(name = "test")
public class HelloWorldController {

	@GetMapping("/hello")
//	@ApiOperation (value = "Hello World API to validate JWT Token", response = String.class)
	public String firstPage() {
		return "Hello World";
	}

}