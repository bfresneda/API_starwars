package br.com.starwars.resistenciarebelde.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starwars.resistenciarebelde.entities.LocalizacaoEntity;
import br.com.starwars.resistenciarebelde.entities.RebeldeEntity;
import br.com.starwars.resistenciarebelde.repositories.LocalizacaoRepository;
import br.com.starwars.resistenciarebelde.repositories.RebeldeRepository;
import br.com.starwars.resistenciarebelde.services.LocalizacaoService;

@Service
public class LocalizacaoServiceImpl implements LocalizacaoService {

	@Autowired
	private LocalizacaoRepository localizacaoRepository;

	@Autowired
	private RebeldeRepository rebeldeRepository;

	@Override
	public LocalizacaoEntity salvarLocalizaoRebelde(Long idRebelde, LocalizacaoEntity localizacaoEntity) {

		Optional<RebeldeEntity> rebeldeOpt = rebeldeRepository.findById(idRebelde);

		if (rebeldeOpt.isEmpty()) {
			return null;
		}
		
		RebeldeEntity rebeldeEntity = rebeldeOpt.get();

		localizacaoEntity.setRebelde(rebeldeEntity);
		return localizacaoRepository.save(localizacaoEntity);
	}
	
	@Override
	public LocalizacaoEntity atualizarLocalizacao(Long idLocalizacao, LocalizacaoEntity localizacaoEntity) {
		Optional<LocalizacaoEntity> localizacaoOpt = localizacaoRepository.findById(idLocalizacao);
		
		if(localizacaoOpt.isEmpty()) {
			return null;
		}
		
		localizacaoEntity = localizacaoOpt.get();
		
			
		return localizacaoRepository.save(localizacaoEntity);
	}

	@Override
	public List<LocalizacaoEntity> findAll() {
		return localizacaoRepository.findAll();
	}

	@Override
	public LocalizacaoEntity findById(Long id) {
		localizacaoRepository.findById(id);
		return null;
	}

	@Override
	public LocalizacaoEntity findByNomeGalaxia(String nome) {
		localizacaoRepository.findByNomeGalaxia(nome);
		return null;
	}

	@Override
	public LocalizacaoEntity deleteById(Long id) {
		localizacaoRepository.deleteById(id);
		return null;
	}

}
