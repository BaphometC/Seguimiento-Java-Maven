package com.seguimiento.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Proveedor;
import com.seguimiento.model.Suscripcion;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.proveedor.ProveedorRepository;
import com.seguimiento.repository.suscripcion.SuscripcionRepository;


@RestController
public class FinanzasController {

	@Autowired
	private ProveedorRepository proveedorRepo;
	@Autowired
	private SuscripcionRepository suscripcionRepo;
	
	@GetMapping("/finanzas/{idMes}/{idUsuario}")
	public ResponseEntity<List<Proveedor>> getFinanzas(@PathVariable long idMes, @PathVariable long idUsuario){
		 List<Suscripcion> listames = suscripcionRepo.findByIdMes(idMes);
		 List<Suscripcion> newlista = listames.stream().filter(l -> l.getIdUsuario()==idUsuario).toList();
		 List<Proveedor> listaproveedor = new ArrayList<Proveedor>();
		 newlista.forEach(sus -> listaproveedor.add(proveedorRepo.findById(sus.getIdProveedor()).get()));
		 return new ResponseEntity<List<Proveedor>>(listaproveedor, HttpStatus.OK);
	}
}
