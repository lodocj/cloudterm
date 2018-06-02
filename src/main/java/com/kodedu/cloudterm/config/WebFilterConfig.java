package com.kodedu.cloudterm.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.duowan.dc.web.auth.client.AuthFilter;

//@Configuration
public class WebFilterConfig {
	@Bean  
    public FilterRegistrationBean authFilterRegistration() {  
        FilterRegistrationBean registration = new FilterRegistrationBean();  
        registration.setFilter(authFilter());  
        registration.addUrlPatterns("/*");  
        registration.setName("authFilter");  
        registration.setOrder(5);
        return registration;  
    }  
	
	@Bean
	public Filter authFilter() {
		return new AuthFilter();
	}
}
