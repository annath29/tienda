package com.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.ItemFactura;
import com.tienda.repository.IItemFacturaDao;

@Service
public class ItemFacturaService {
	@Autowired
	IItemFacturaDao itemFacturaDao;
	
	public ItemFactura guardarItemFactura(ItemFactura itemfactura) {
		return itemFacturaDao.save(itemfactura);
	}
	
	public ItemFactura obtenerItem(Integer id) {
		return itemFacturaDao.findById(id).orElse(null);
	}
}
