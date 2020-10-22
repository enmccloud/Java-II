package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Housing;

@Configuration
public class BeanConfiguration {

	@Bean
	public Housing housing() {
		Housing bean = new Housing("Test Name");
		//bean.setDeedHolder("Nikki McCloud");
		//bean.setSquareFootage("1,200");
		//bean.setDwellingType("Residential");
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address ("309 Arthur Neu Dr.", "Carroll", "Iowa", 51401);
		return bean;
	}
}
