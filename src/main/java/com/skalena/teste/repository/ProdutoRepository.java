package com.skalena.teste.repository;

import org.springframework.data.repository.CrudRepository;

import com.skalena.teste.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
