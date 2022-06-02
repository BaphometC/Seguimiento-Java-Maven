package com.seguimiento.repository.suscripcion;

import java.util.Optional;
import java.util.List;

import com.seguimiento.model.Suscripcion;

public interface SuscripcionService {
    List < Suscripcion > findAll();

    void save(Suscripcion suscripcion);

    Optional < Suscripcion > findById(Long suscripcionId);

    void delete(Long suscripcionId);
}
