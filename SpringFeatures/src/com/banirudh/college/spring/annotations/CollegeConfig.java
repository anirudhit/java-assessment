package com.banirudh.college.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	@Bean
	public College collegeObject() {
		College college = new College();
		return college;
	}
}
