package com.cibertec.ExamenLeonardoHuerto.Services;

import com.cibertec.ExamenLeonardoHuerto.Model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductoServices {
    List<Producto> GetAllProductos();
    Producto SaveProducto(Producto entity);
    Producto FindProductoById(int id);
    List<Producto> SearchProductos(String name);
}
