package br.com.criandoapi.projeto.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.InterfaceImovel;
import br.com.criandoapi.projeto.model.Imovel;

@RequestMapping("/imovel")
@RestController
@CrossOrigin("*")
public class ImovelController {
	
	@Autowired
	private InterfaceImovel dao;
	
	@GetMapping
	public List<Imovel> listatImovel() {
		return (List<Imovel>) dao.findAll();
	}
	
	@PostMapping
	public Imovel criarImovel (@RequestBody Imovel imovel) {
		Imovel imovelNovo = dao.save(imovel);
		return imovelNovo;
	}
	
	@PutMapping
	public Imovel editarImovel (@RequestBody Imovel imovel) {
		Imovel imovelNovo = dao.save(imovel);
		return imovelNovo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Imovel> excluirImovel (@PathVariable Integer id) {
		Optional<Imovel> imovel = dao.findById(id);
		dao.deleteById(id);
		return imovel;
	}
	
}
