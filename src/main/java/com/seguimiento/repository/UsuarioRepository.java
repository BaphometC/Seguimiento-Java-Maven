package com.seguimiento.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.seguimiento.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
