package com.example.ejonespringboot.Controller;

import com.example.ejonespringboot.Model.Producto;
import com.example.ejonespringboot.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/producto")
    @ResponseBody
    public List<Producto> listarProductos(){
        return productoService.listarProductos();
    }

    @PostMapping("/producto")
    @ResponseBody
    public Producto crearProducto(@RequestBody Producto producto){

        return productoService.crearProducto(producto);
    }

    @DeleteMapping("/producto/{id}")
    public void borrarProducto(@PathVariable Long id){

        productoService.borrarProducto(id);
    }

    @GetMapping("/producto/{id}")
    public Producto buscarProducto(@PathVariable Long id){

        return productoService.buscarProductoId(id);
    }


    @PutMapping("/producto")
    public void modificarProducto(@RequestBody Producto producto){

        productoService.modificarProducto(producto);
    }

    @PutMapping("/producto/{id}")
    public void modificarPersonaID(@RequestBody Producto producto, @PathVariable long id){
        productoService.modificarProducto(producto);
    }
}
