package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-90");
	}
	
	@GetMapping(path = "/{id}")
	public Cliente obterClienteporId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "098.765.432.10");
	}
	
}
