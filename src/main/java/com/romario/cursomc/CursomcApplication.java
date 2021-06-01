package com.romario.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.romario.cursomc.domain.Categoria;
import com.romario.cursomc.domain.Cidade;
import com.romario.cursomc.domain.Cliente;
import com.romario.cursomc.domain.Endereco;
import com.romario.cursomc.domain.Estado;
import com.romario.cursomc.domain.Produto;
import com.romario.cursomc.domain.enums.TipoCliente;
import com.romario.cursomc.repositories.CategoriaRepository;
import com.romario.cursomc.repositories.CidadeRepository;
import com.romario.cursomc.repositories.ClienteRepository;
import com.romario.cursomc.repositories.EnderecoRepository;
import com.romario.cursomc.repositories.EstadoRepository;
import com.romario.cursomc.repositories.Produtorepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository ct;
	
	@Autowired
	private Produtorepository pt;
	
	@Autowired
	private EstadoRepository er;
	
	@Autowired
	private CidadeRepository cr;
	
	@Autowired
	private ClienteRepository clir;
	
	@Autowired
	private EnderecoRepository endr;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "empressora ", 1500.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		ct.saveAll(Arrays.asList(cat1,cat2));
		pt.saveAll(Arrays.asList(p1,p2,p3));
		
		
		Estado est1 = new Estado(null, "Sao Paulo");
		Estado est2 = new Estado(null, "Parana");
		
		Cidade c1 = new Cidade(null, "Pinahlzinho", est1);
		Cidade c2 = new Cidade(null, "Sao Paulo", est1);
		Cidade c3 = new Cidade(null, "arapongas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1,c2));
		est2.getCidades().addAll(Arrays.asList(c3));
		
		er.saveAll(Arrays.asList(est1,est2));
		cr.saveAll(Arrays.asList(c1,c2,c3));
	
		Cliente cli1 = new Cliente(null, "Romario Ribeiro", "romario@gmail.com", "12345678911", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("43996321104"));
		
		Endereco end1 = new Endereco(null,"Rua Espanha", "357", "Apto 303", "Jardim das acacias", "86720000", cli1, c3);
		Endereco end2  = new Endereco(null, "Rua das Flores", "300", "Apto 203", "Jardim", "12345678", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1,end2));
		
		clir.saveAll(Arrays.asList(cli1));
		endr.saveAll(Arrays.asList(end1,end2));
	}

}
