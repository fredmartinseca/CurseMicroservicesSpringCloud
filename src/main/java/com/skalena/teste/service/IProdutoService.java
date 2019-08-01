package com.skalena.teste.service;

import java.util.List;

import com.skalena.teste.entity.Produto;

public interface IProdutoService {
	
	public List<Produto> findAll();
	public Produto findById(Long id);

}
