package com.example.oktatokenip;

import com.example.oktatokenip.controller.CustomFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.servlet.FilterRegistration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OktaTokenIpApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktaTokenIpApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean<CustomFilter> customFilterRegistrationBean() {
		FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new CustomFilter());
		registrationBean.addUrlPatterns("/*"); // Set the URL patterns to which the filter should be applied
		return registrationBean;
	}
}
