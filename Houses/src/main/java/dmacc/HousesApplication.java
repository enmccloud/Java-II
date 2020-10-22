/**************************************************************
* Name        : Spring Houses Application
* Author      : Nikki McCloud
* Created     : 10/22/20
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  Takes housing and address info to add
*               to a table in a database.
*               Output: Data stored in database. 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Housing;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HousesRepository;

@SpringBootApplication
public class HousesApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(HousesApplication.class, args);
	}
	
	@Autowired
	HousesRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using my Existing Housing Bean
		Housing h = appContext.getBean("housing", Housing.class);
		h.setDwellingType("Commercial");
		repo.save(h);
		
		//Creating new Housing and Address bean.
		Housing r = new Housing ("Jiminy Christmas", "3,200", "Residential");
		Address a = new Address ("867 Jenny Lane", "Newton", "Iowa", 50208);
		r.setAddress(a);
		repo.save(r);
		
		//Creating list for housing with entities
		List<Housing> housingList = repo.findAll();
		for(Housing properties: housingList) {
			System.out.println(properties.toString());
		}
		//Closing context
		((AbstractApplicationContext) appContext).close();
	}
}


