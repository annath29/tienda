package com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entity.Product;
import com.tienda.service.ProductService;

@RestController
@RequestMapping("apiProductos")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@PostMapping("/guardar")
	public Product saveProduct(@RequestBody Product product) {
		return productservice.saveProducto(product);
	}
	
	@PostMapping("/guardar-all")
	public boolean saveProducts(@RequestBody List<Product> products) {
		return productservice.saveProductos(products);
	}
	@GetMapping("/getbylowerprice")
	public List<Product>getProductbypricelow(Double precio){
		return productservice.getProductbypricelow(precio);
	}
	@GetMapping("/getname")
	public Product findname(String nombre) {
		return productservice.finbyname(nombre);
	}
}
