package com.tarrant.gradlespringmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.tarrant.gradlespringmvc.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ServletContextTemplateResolver templateResolver() {
		ServletContextTemplateResolver sctr = new ServletContextTemplateResolver();
		sctr.setPrefix("/WEB-INF/templates/");
		sctr.setSuffix(".html");
		sctr.setTemplateMode("HTML5");
		return sctr;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine ste = new SpringTemplateEngine();
		ste.setTemplateResolver(templateResolver());
		return ste;
	}

	@Bean
	public ThymeleafViewResolver viewResolver() {
		ThymeleafViewResolver tvr = new ThymeleafViewResolver();
		tvr.setTemplateEngine(templateEngine());
		return tvr;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
		.addResourceLocations("/resources/");
	}

}