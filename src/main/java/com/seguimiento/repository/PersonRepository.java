package com.seguimiento.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.seguimiento.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{
	
}
