package tn.esprit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.EntrepriseServiceImpl;

@SpringBootApplication
//@EnableAutoConfiguration
public class TimesheetApplication {

	public static void main(String[] args) 
	{SpringApplication.run(TimesheetApplication.class, args);






	;}

 
}
