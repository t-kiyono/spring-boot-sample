package net.be_geek.spring_boot_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class App {

	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot!";
	}

	public static void main( String[] args ) {
		SpringApplication.run(App.class, args);
	}
}
