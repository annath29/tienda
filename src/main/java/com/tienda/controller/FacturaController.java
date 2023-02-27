package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entity.Factura;
import com.tienda.service.FacturaService;

@RestController
@RequestMapping("/apiFacturas")
public class FacturaController {
	@Autowired
	FacturaService facturaService;
	
	@PostMapping("/crear")
	public Factura crearFactura(@RequestBody Factura factura) {
		return facturaService.nuevaFactura(factura);
	}
	
	@GetMapping("/obtener")
	public Factura obtenerFactura(Integer id) {
		return facturaService.obtenerFactura(id);
	}
}
