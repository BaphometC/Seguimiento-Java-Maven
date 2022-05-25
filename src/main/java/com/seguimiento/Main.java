package com.seguimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Person;
import com.seguimiento.repository.PersonRepository;

@SpringBootApplication
public class Main implements CommandLineRunner{
	@Autowired
	  PersonRepository personRepo;

	  public static void main(String args[]){
	     SpringApplication.run(Main.class, args);
	  }
	  public void run(String... arg0) throws Exception {
	    System.out.println("Inserting person records:");

	    Person person1 = new Person("Mickey Mouse",35);
	    Person person2 = new Person("Donald Duck",30);
	    personRepo.save(person1);
	    personRepo.save(person2);

	    List<Person> personList = personRepo.findAll();
	    
	    for (Person person: personList) {
	    	System.out.println(person.toString());
	    }
	  }
}