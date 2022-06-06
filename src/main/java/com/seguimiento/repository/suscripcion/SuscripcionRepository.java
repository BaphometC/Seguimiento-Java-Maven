package com.seguimiento.repository.suscripcion;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seguimiento.model.Suscripcion;


public interface SuscripcionRepository extends JpaRepository<Suscripcion, Long>{

	List<Suscripcion>findByIdUsuario(long idUsuario);
	
	List<Suscripcion>findByIdMes(long idMes);
}
