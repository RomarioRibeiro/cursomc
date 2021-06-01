package com.romario.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romario.cursomc.domain.Cliente;
import com.romario.cursomc.repositories.ClienteRepository;
import com.romario.cursomc.resource.exception.objectionException;

@Service
public class ClienteService {
@Autowired	
private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new objectionException("Objeto não encontrado ! id :" + id + "tipo : " + Cliente.class.getName()));
	}
	
}
