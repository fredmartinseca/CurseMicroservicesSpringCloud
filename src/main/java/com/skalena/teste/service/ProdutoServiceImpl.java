package com.skalena.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skalena.teste.entity.Produto;
import com.skalena.teste.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements IProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	@Override
	@Transactional(readOnly = true)
	public List<Produto> findAll() {
		return (List<Produto>) produtoRepo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Produto findById(Long id) {
		return produtoRepo.findById(id).orElse(null);
	}

}
