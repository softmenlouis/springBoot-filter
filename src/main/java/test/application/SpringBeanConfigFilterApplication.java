package test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
	basePackages = "test",
	excludeFilters = {
		@ComponentScan.Filter(
			type = FilterType.REGEX,
			pattern = "test.application.*"
		)
	}
)
public class SpringBeanConfigFilterApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBeanConfigFilterApplication.class, args);
	}
}