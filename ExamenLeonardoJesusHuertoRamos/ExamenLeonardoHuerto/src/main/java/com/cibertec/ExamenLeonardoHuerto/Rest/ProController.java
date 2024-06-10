package com.cibertec.ExamenLeonardoHuerto.Rest;

import com.cibertec.ExamenLeonardoHuerto.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    IProductoServices productoServices;

    @Autowired
    public ProductoController(IProductoServices productoServices) {
        this.productoServices=productoServices;
    }

    @GetMapping("/producto")
    public List<Pet> getAll() {
        return productoServices.GetAllProductos();
    }

    @GetMapping("/producto/{id}")
    public Producto getAll(@PathVariable int id) {
        return productoServices.FindProductoById(id);
    }

    @PostMapping("/prodcuto")
    public Producto saveProducto(@RequestBody Producto entity) {
        return productoServices.SaveProducto(entity);
    }
}
