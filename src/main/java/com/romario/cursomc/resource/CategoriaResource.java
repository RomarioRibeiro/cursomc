package com.romario.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romario.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> leitura() {
		
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
 		
		return list;
	}
	
}
