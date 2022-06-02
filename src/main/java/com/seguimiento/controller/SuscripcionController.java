package com.seguimiento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Suscripcion;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.suscripcion.SuscripcionRepository;
import com.seguimiento.repository.suscripcion.SuscripcionService;
import com.seguimiento.repository.usuario.UsuarioRepository;

@RestController
public class SuscripcionController implements SuscripcionService{

	@Autowired
	private SuscripcionRepository suscripcionRepo;
	
	@GetMapping("/suscripciones")
	public List<Suscripcion> findAll() {
		List<Suscripcion> suscripcionlist = suscripcionRepo.findAll();
		return suscripcionlist;
	}

	@GetMapping("/suscripciones/{suscripcionId}")
	public Optional < Suscripcion > findById(@PathVariable Long suscripcionId) {
		return suscripcionRepo.findById(suscripcionId);
	}

	@PostMapping("/suscripciones/newsuscripcion")
	public void save(Suscripcion suscripcion) {
		suscripcionRepo.save(suscripcion);
	}
	
	@PostMapping("/suscripciones/delete/{suscripcionId}")
	public void delete(@PathVariable Long suscripcionId){
		suscripcionRepo.deleteById(suscripcionId);
	}
}
