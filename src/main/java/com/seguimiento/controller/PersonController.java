package com.seguimiento.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.seguimiento.model.Person;

@RestController
public class PersonController {
	@GetMapping("/person")
	  public List<Person> getAllPersons(){
	    //Returns hardcoded data, a real world application would return from the database
	    List<Person> personList = new ArrayList<Person>();
	    personList.add(new Person("Mickey Mouse", 30));
	    personList.add(new Person("Donald Duck", 35));
	    personList.add(new Person("Peppa Pig", 15));
	    return personList;
	  } 

	  @GetMapping("/person/{personId}")
	  public Person getPersonWithId(@PathVariable Integer personId){
	    //Returns hardcoded data, a real world application would return from the database
	    return new Person("Peppa Pig", 15);
	  } 


	  @PostMapping("/person/newperson")
	  public void addPerson(@RequestBody Person person){
	    //Just has a Sysout stmt, a real world application would save this record to the database
	    System.out.println("Saving person information");

	  }
}
