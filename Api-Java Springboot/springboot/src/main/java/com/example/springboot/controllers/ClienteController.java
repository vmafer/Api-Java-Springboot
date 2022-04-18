package com.example.springboot.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
/*import org.springframework.data.domain.PageRequest;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.entities.Cliente;

import com.example.springboot.model.repositories.ClienteRepository;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/clientes")
public class ClienteController {
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@PostMapping							
	public @ResponseBody Cliente novoCliente (@Valid Cliente cliente) {
		clienteRepository.save(cliente);
		
		return cliente;
	}
	
	@GetMapping
	public Iterable<Cliente>obterClientes() {
		return clienteRepository.findAll();
		
	}
	
	/*@GetMapping("/nome/{parteNome}")
	public Iterable<Cliente>obterClientesPorNome(@PathVariable String parteNome) {
		return clienteRepository.findByNomeContaining(parteNome);
		
	}
	
	/*@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Cliente> obterClientesPorPagina(@PathVariable int numeroPagina){
		PageRequest page = PageRequest.of(numeroPagina,3);
		return clienteRepository.findAll(page);
	}*/
	
	@GetMapping(path= "/{id}")
	public Optional<Cliente> obterClienteoPorId(@PathVariable int id) {
		return clienteRepository.findById(id);
	}
	
	@PutMapping
	public Cliente alterarCliente(@Valid Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@DeleteMapping(path= "/{id}")
	public void excluirCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}
	



}
