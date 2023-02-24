package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;

import com.tienda.entity.ItemFactura;

public interface IItemFacturaDao extends CrudRepository<ItemFactura, Integer> {

}
