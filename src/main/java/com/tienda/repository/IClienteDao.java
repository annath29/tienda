package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.entity.Cliente;

@Repository
public interface IClienteDao extends CrudRepository<Cliente, Integer> {

}
