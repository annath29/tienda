package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entity.ItemFactura;
import com.tienda.service.ItemFacturaService;

@RestController
@RequestMapping("/apiFactura")
public class ItemFacturaController {
	@Autowired
	ItemFacturaService itemFacturaService;
	
	@PostMapping("/save")
	public ItemFactura guardarItem(@RequestBody ItemFactura item) {
		return  itemFacturaService.guardarItemFactura(item);
	}
	
	@GetMapping("/buscar-item")
    public ItemFactura obtenerFactura(Integer id){
        return itemFacturaService.obtenerItem(id);
    }

}
