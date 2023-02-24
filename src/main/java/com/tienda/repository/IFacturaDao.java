package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.entity.Factura;
@Repository
public interface IFacturaDao extends CrudRepository<Factura, Integer> {

}
