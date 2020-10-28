package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contact contact() {
		Contact bean = new Contact("Jon Campbell");
		//bean.setName("Test Name");
		//bean.setPhone("712-867-5309");
		//bean.setRelationship("Tester");
		return bean;
	}

	@Bean
	public Address address() {
		Address bean = new Address("123 Main Street", "Des Moines", "IA");
		return bean;
	}
}