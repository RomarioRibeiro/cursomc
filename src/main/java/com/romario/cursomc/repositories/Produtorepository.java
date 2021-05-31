package com.romario.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romario.cursomc.domain.Produto;

@Repository
public interface Produtorepository extends JpaRepository<Produto, Integer> {

}
