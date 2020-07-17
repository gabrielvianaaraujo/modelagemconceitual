package br.com.gabriel.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabriel.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}