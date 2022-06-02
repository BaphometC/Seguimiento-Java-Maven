package com.seguimiento.repository.proveedor;

import java.util.Optional;
import java.util.List;

import com.seguimiento.model.Proveedor;

public interface ProveedorService {
    List < Proveedor > findAll();

    void save(Proveedor proveedor);

    Optional < Proveedor > findById(Long proveedorId);

    void delete(Long proveedorId);

}
