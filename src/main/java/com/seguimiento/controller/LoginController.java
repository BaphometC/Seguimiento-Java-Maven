package com.seguimiento.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.websocket.Session;

import org.apache.catalina.User;
import org.hibernate.Criteria;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Categoria;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.usuario.UsuarioRepository;

import javassist.expr.NewExpr;

@RestController
public class LoginController {

	@Autowired
	private UsuarioRepository usuarioRepo;

	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestParam long dni, @RequestParam String password){
		Usuario user = usuarioRepo.findByDni(dni);
		if(user.getPassword().equals(password)) {
			return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		}
		return new ResponseEntity<Usuario>(new Usuario(),HttpStatus.BAD_REQUEST);
	}
}
