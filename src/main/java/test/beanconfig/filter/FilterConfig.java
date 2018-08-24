package test.beanconfig.filter;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	@Bean
	public FilterRegistrationBean<Filter> registFilter() {
		System.out.println("here");
		FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new SpringBeanConfigFilter());
		registration.addUrlPatterns("/testRest");
		registration.setOrder(2);
		registration.setName("testFilter");
		return registration;
	}

	@Bean
	public FilterRegistrationBean<Filter> registFilter2() {
		FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new SpringBeanConfigFilter2());
		registration.addUrlPatterns("/testRest");
		registration.setOrder(1);
		registration.setName("testFilter2");
		return registration;
	}
}