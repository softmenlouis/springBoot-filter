package test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
	basePackages={"test"},
	excludeFilters = {
		@ComponentScan.Filter(
			type = FilterType.REGEX,
			pattern = "test.beanconfig.filter.*"
		),
		@ComponentScan.Filter(
			type = FilterType.REGEX,
			pattern = "test.application.*"
		)
	}
)
@ServletComponentScan("test.annotation.filter")
public class SptringAnnotationFilterApplication {
	public static void main(String[] args) {
		SpringApplication.run(SptringAnnotationFilterApplication.class, args);
	}
}