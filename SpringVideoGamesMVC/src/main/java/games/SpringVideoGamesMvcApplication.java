/**************************************************************
* Name        : Video Game List Spring Boot MVC (Week 10 Lab)
* Author      : Nikki McCloud
* Created     : 11/2/2020
* Course      : CIS 175 Java II
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program stores an editable list of video
* 				games to a database.
*               Input:  Title, Players, Rating, Genre, & Console
*               Output: List of games you can edit/delete.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

package games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringVideoGamesMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVideoGamesMvcApplication.class, args);
	}

}
