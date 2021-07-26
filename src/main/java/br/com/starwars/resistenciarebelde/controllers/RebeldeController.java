package br.com.starwars.resistenciarebelde.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starwars.resistenciarebelde.entities.RebeldeEntity;
import br.com.starwars.resistenciarebelde.services.impl.RebeldeServiceImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/rebeldes")
@RequiredArgsConstructor
public class RebeldeController {
	
	@Autowired
	public RebeldeServiceImpl rebeldeServiceImpl;
	
	@PostMapping
	public RebeldeEntity salvarRebelde(@RequestBody RebeldeEntity rebeldeEntity) {
		rebeldeServiceImpl.save(rebeldeEntity);
		return rebeldeEntity;
	}
	

	@GetMapping("/{id}")
	public Optional<RebeldeEntity> BuscarRebeldePorId(@PathVariable Long id) {
		return rebeldeServiceImpl.findById(id);
	}
	
	
	
	@GetMapping
	public List<RebeldeEntity> listarRebelde() {
		return rebeldeServiceImpl.findAll();
	}
	
	
	@DeleteMapping("/{id}")
	public RebeldeEntity deletarRebelde(@PathVariable Long id) {
		return rebeldeServiceImpl.deleteById(id);
		
	}
	
}
