package com.love.calculator.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.love.calculator.formatter.PhoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.love.calculator.controller", "com.love.calculator.validator",
		"com.love.calculator.service" , "com.love.calculator.model.attribute.method.level" , "com.spring.bean.scope" })
@PropertySource("classpath:email.properties")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {
	
	@Autowired
	private Environment env; //this is used to load the data dynamically from properties file..
	
	Logger logger = Logger.getLogger(LoveCalculatorAppConfig.class.getName());

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		// this method is registring or telling spring that i am using
		// phoneformatter....which is present in webmvcconfigurer...
		registry.addFormatter(new PhoneFormatter());
	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		
//		System.out.println(env.getProperty("mail.host"));
		logger.info(env.getProperty("mail.host"));
		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(getIntProperty("mail.port"));

		Properties mailProperties = getMailProperties();

		javaMailSenderImpl.setJavaMailProperties(mailProperties);

		return javaMailSenderImpl;
	}

	private Properties getMailProperties() {
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", "true");
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		return mailProperties;
	}
	
	int getIntProperty(String key) {
		String property = env.getProperty(key);
		return Integer.parseInt(property);
	}

//	@Bean
//	public MessageSource messageSource() {
//		// this is looking for the messages.properties file for error messages
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}

//	@Bean
//	public LocalValidatorFactoryBean validator() {
//		// this is looking for messageSource.spring don't know which bean we are using
//		// for custom validation displaying messages...
////		this validator will look for messageSource()
//		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
//		localValidatorFactoryBean.setValidationMessageSource(messageSource());
//		return localValidatorFactoryBean;
//	}

//	@Override
//	public Validator getValidator() {
//		// TODO Auto-generated method stub
//		// here we are registering out validator
//		return validator();
//	}
}
