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
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepo;

	@GetMapping("/usuario")
	public List<Usuario> getAllUsuarios() {
		List<Usuario> usuarioList = usuarioRepo.findAll();
		return usuarioList;
	}

	@GetMapping("/person/{personId}")
	public Usuario getPersonWithId(@PathVariable Integer personId) {
		// Returns hardcoded data, a real world application would return from the
		// database
		return new Usuario(33333333, null, "Peppa Pig", null, 333333333, null, 3333, null);
	}

	@PostMapping("/person/newperson")
	public void addPerson(@RequestBody Usuario person) {
		// Just has a Sysout stmt, a real world application would save this record to
		// the database
		System.out.println("Saving person information");

	}
}
