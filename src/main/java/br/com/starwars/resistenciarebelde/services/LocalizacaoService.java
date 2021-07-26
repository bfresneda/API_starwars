package br.com.starwars.resistenciarebelde.services;

import java.util.List;

import br.com.starwars.resistenciarebelde.entities.LocalizacaoEntity;

public interface LocalizacaoService {
	
	List<LocalizacaoEntity> findAll();
	
	LocalizacaoEntity findById(final Long id);
	
	LocalizacaoEntity deleteById(final Long id);
	
	LocalizacaoEntity findByNomeGalaxia(String nome);
	
	LocalizacaoEntity salvarLocalizaoRebelde(Long idRebelde, LocalizacaoEntity localizacaoEntity);

	LocalizacaoEntity atualizarLocalizacao(Long idLocalizacao, LocalizacaoEntity localizacaoEntity);

}
