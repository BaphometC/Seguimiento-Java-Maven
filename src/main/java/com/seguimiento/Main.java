package com.seguimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.seguimiento.model.*;
import com.seguimiento.repository.*;
import com.seguimiento.repository.categoria.CategoriaRepository;
import com.seguimiento.repository.mes.MesRepository;
import com.seguimiento.repository.usuario.UsuarioRepository;

import utils.SHA512;

import com.seguimiento.repository.proveedor.ProveedorRepository;
import com.seguimiento.repository.suscripcion.SuscripcionRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	public UsuarioRepository usuarioRepo;
	@Autowired
	public ProveedorRepository proveedorRepo;
	@Autowired
	public CategoriaRepository categoriaRepo;
	@Autowired
	public MesRepository mesRepo;

	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
	}

	public void run(String... arg0) throws Exception {
		UsuarioSeeder();
		ProveedorSeeder();
		CategoriaSeeder();
		MesSeeder();
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*");
	            }
	        };
	    }
	
	public void UsuarioSeeder() {
		Usuario user1 = new Usuario(11111111, "123", "Mickey Mouse", "123", 111111111, "123", 123, "123");
		Usuario user2 = new Usuario(22222222, "345", "Mickey Mouse", null, 222222222, null, 2222, null);
		Usuario user3 = new Usuario(1234, SHA512.sha256("123"), "Hans Olivas", "correo@correo.com", 951789456, "Av.los olivos123", 1587, "Tarjeta Oh!");
		usuarioRepo.save(user1);
		usuarioRepo.save(user2);
		usuarioRepo.save(user3);
	}

	public void ProveedorSeeder() {
		Proveedor proveedor1 = new Proveedor("Mickey Mouse1", "Mickey Mouse1", "Mickey Mouse1", 45.22, "Mickey Mouse1",
				"Mickey Mouse1");
		Proveedor proveedor2 = new Proveedor("Mickey Mouse2", "Mickey Mouse2", "Mickey Mouse2", 45.23, "Mickey Mouse2",
				"Mickey Mouse2");
		Proveedor proveedor3 = new Proveedor("Mickey Mouse3", "Mickey Mouse3", "Mickey Mouse3", 45.24, "Mickey Mouse4",
				"Mickey Mouse3");
		proveedorRepo.save(proveedor1);
		proveedorRepo.save(proveedor2);
		proveedorRepo.save(proveedor3);
	}

	public void CategoriaSeeder() {
		Categoria categoria1 = new Categoria("Peliculas");
		Categoria categoria2 = new Categoria("Musica");
		Categoria categoria3 = new Categoria("Series");
		Categoria categoria4 = new Categoria("Noticias");
		this.categoriaRepo.save(categoria1);
		this.categoriaRepo.save(categoria2);
		this.categoriaRepo.save(categoria3);
		this.categoriaRepo.save(categoria4);
	}
	
	public void MesSeeder() {
		Mes mes1 = new Mes(1,"Enero");
		Mes mes2 = new Mes(2,"Febrero");
		Mes mes3 = new Mes(3,"Marzo");
		Mes mes4 = new Mes(4,"Abril");
		Mes mes5 = new Mes(5,"Mayo");
		Mes mes6 = new Mes(6,"Junio");
		Mes mes7 = new Mes(7,"Julio");
		Mes mes8 = new Mes(8,"Agosto");
		Mes mes9 = new Mes(9,"Septiembre");
		Mes mes10 = new Mes(10,"Octubre");
		Mes mes11 = new Mes(11,"Noviembre");
		Mes mes12 = new Mes(12,"Diciembre");
		this.mesRepo.save(mes1);
		this.mesRepo.save(mes2);
		this.mesRepo.save(mes3);
		this.mesRepo.save(mes4);
		this.mesRepo.save(mes5);
		this.mesRepo.save(mes6);
		this.mesRepo.save(mes7);
		this.mesRepo.save(mes8);
		this.mesRepo.save(mes9);
		this.mesRepo.save(mes10);
		this.mesRepo.save(mes11);
		this.mesRepo.save(mes12);
	}

}