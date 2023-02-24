package com.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.Factura;
import com.tienda.repository.IFacturaDao;

@Service
public class FacturaService {
	@Autowired
	IFacturaDao facturaDao;
		
	public Factura nuevaFactura(Factura nueva) {
		return facturaDao.save(nueva);
	}
	
	public Factura obtenerFactura(Integer id) {
		return facturaDao.findById(id).orElse(null);
	}

}
