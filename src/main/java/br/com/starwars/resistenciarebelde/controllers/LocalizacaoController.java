package br.com.starwars.resistenciarebelde.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starwars.resistenciarebelde.entities.LocalizacaoEntity;
import br.com.starwars.resistenciarebelde.services.impl.LocalizacaoServiceImpl;

@RestController
@RequestMapping("/rebeldes/localizacao")
public class LocalizacaoController {
	
	@Autowired
	private LocalizacaoServiceImpl localizacaoServiceImpl;

	
	@PostMapping("/{idRebelde}")
	public LocalizacaoEntity salvarLocalizacao(@PathVariable Long idRebelde,
											   @RequestBody LocalizacaoEntity localizacaoEntity) {
		return localizacaoServiceImpl.salvarLocalizaoRebelde(idRebelde, localizacaoEntity);
	}

	@PutMapping("/{idLocalizacao}")
	public LocalizacaoEntity atualizarLocalizacao(@PathVariable Long idLocalizacao,
												  @RequestBody LocalizacaoEntity localizacaoEntity) {
		return localizacaoServiceImpl.salvarLocalizaoRebelde(idLocalizacao, localizacaoEntity);
	}

	
	@GetMapping
	public List<LocalizacaoEntity> buscarTodasLocalizacoes() {
		return localizacaoServiceImpl.findAll();
	}
	
	
}
