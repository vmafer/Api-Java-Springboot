package com.example.springboot.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.springboot.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContaining(String parteNome);

}