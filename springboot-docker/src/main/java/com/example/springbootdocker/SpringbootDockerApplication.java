package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}
	
	 @RequestMapping(value = "/{nume}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public String hello(@PathVariable String nume) {
			return "Hello, " + nume;
		}
}
