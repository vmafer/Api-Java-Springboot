package com.example.springboot.controllers;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.entities.Produto;
import com.example.springboot.model.repositories.ProdutoRepository;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

	@Autowired 
	private ProdutoRepository produtoRepository;
	
	@PostMapping							
	public @ResponseBody Produto novoProduto (@Valid Produto produto) {
		produtoRepository.save(produto);
		
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto>obterProdutos() {
		return produtoRepository.findAll();
		
	}
	
	@GetMapping("/nome/{parteNome}")
	public Iterable<Produto>obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContaining(parteNome);
		
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina){
		PageRequest page = PageRequest.of(numeroPagina,3);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path= "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping(path= "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	
	
	
	
}
