package com.romario.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romario.cursomc.domain.Categoria;
import com.romario.cursomc.repositories.CategoriaRepository;
import com.romario.cursomc.resource.exception.objectionException;

@Service
public class CategoriaService {
@Autowired	
private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new objectionException("Objeto não encontrado ! id :" + id + "tipo : " + Categoria.class.getName()));
	}
	
}
