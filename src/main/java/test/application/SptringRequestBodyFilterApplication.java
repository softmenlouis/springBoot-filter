package test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("test.requestbody.filter")
public class SptringRequestBodyFilterApplication {
	public static void main(String[] args) {
		SpringApplication.run(SptringRequestBodyFilterApplication.class, args);
	}
}