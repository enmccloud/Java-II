/**************************************************************
* Name        : Spring Contacts Week 8 Lab
* Author      : Nikki McCloud
* Created     : 10/22/20
* Course      : Java II
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  Contact information & Address in database
*               Output: Stores/Shows list of contact info
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
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;

@SpringBootApplication
public class SpringContactsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringContactsApplication.class, args);
	}
			/*
			ApplicationContext appContext = new
			AnnotationConfigApplicationContext(BeanConfiguration.class);

			Contact c = appContext.getBean("contact", Contact.class);

			System.out.println(c.toString());
			*/
}
	
	
//Commenting Out for MVC
/*
	@Autowired
	ContactRepository repo;

	@Override
	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using already created bean.
		Contact c = appContext.getBean("contact", Contact.class);
		c.setRelationship("Fiance");
		repo.save(c);
		
		//Create a new bean. 
		Contact d = new Contact("Nikki McCloud", "712-210-5283", "Me");
		Address a = new Address("309 Arthur Neu Dr.", "Carroll", "IA");
		d.setAddress(a);
		repo.save(d);
		
		List<Contact> allMyContacts = repo.findAll();
		for(Contact people: allMyContacts) {
			System.out.println(people.toString());
		}
		
		//Closing Context
		((AbstractApplicationContext) appContext).close();
	}

}
*/