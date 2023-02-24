package com.tienda.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.entity.Product;
@Repository
public interface IProductDao extends CrudRepository<Product,Integer>{
	
	@Query(value = "select * from products where precio <= ?",nativeQuery = true)
	public List<Product> searchProductbyprice(Double precio);
	
	public Optional<Product>findByNombre(String nombre);
}
