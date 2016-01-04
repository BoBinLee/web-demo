package com.example.handlebar;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class HandlebarConfig {
	@Bean
	public ViewResolver viewResolver() {
		HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".hbs");
		viewResolver.setCache(false);

		viewResolver.registerHelper("formatDate", new DateHelper());
		return viewResolver;
	}

}
