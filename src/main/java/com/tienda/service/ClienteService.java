package com.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.Cliente;
import com.tienda.repository.IClienteDao;

@Service
public class ClienteService {
	@Autowired
	IClienteDao clienteDao;
	
	public Cliente crearcliente(Cliente nuevo) {
		return clienteDao.save(nuevo);
	}
	
}
