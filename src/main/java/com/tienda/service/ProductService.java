package com.tienda.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.Product;
import com.tienda.repository.IProductDao;

@Service
public class ProductService {
	@Autowired
	IProductDao productDao;
	
	public Product saveProducto(Product product) {
		return productDao.save(product);
	}
	public boolean saveProductos(List<Product>products) {
		try {
			productDao.saveAll(products);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Product>getProductbypricelow(Double precio){
		return productDao.searchProductbyprice(precio);
	}
	
	public Product finbyname(String nombre) {
		return productDao.findByNombre(nombre).orElse(null);
	}
}
