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

import com.seguimiento.model.Proveedor;
import com.seguimiento.repository.ProveedorRepository;

@RestController
public class ProveedorController {
	
	@Autowired
	ProveedorRepository proveedorRepo;
	@GetMapping("/proveedor")
	  public List<Proveedor> getAllProveedores(){
	    
	    List<Proveedor> proveedorList = proveedorRepo.findAll();
	    return proveedorList;
	  } 

	  @GetMapping("/proveedor/{proveedorId}")
	  public Proveedor getProveedorWithId(@PathVariable Integer proveedorId){
	    
	    return new Proveedor("Mickey Mouse", "Mickey Mouse", "Mickey Mouse", 45.2, "Mickey Mouse","Mickey Mouse");
	  } 


	  @PostMapping("/proveedor/newproveedor")
	  public void addProveedor(@RequestBody Proveedor proveedor){
	    
	    System.out.println("Saving proveedor information");

	  }

}
