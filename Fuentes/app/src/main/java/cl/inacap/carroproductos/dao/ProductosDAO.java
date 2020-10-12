package cl.inacap.carroproductos.dao;

import java.util.List;

import cl.inacap.carroproductos.dto.Producto;

public interface ProductosDAO {

    Producto save(Producto p);
    List<Producto> getAll();
}
