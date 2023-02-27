package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entity.Cliente;
import com.tienda.service.ClienteService;

@RestController
@RequestMapping("/apiCliente")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@PostMapping("/crear")
	public Cliente agregarCliente(@RequestBody Cliente cliente) {
		return clienteService.crearcliente(cliente);
	}
}
