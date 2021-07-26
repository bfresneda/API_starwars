package br.com.starwars.resistenciarebelde.services;

import java.util.List;

import br.com.starwars.resistenciarebelde.entities.InventarioEntity;

public interface InventarioService {
	
	List<InventarioEntity> findall();
	
	InventarioEntity findById(final Long id);
	
	InventarioEntity findByNome(String nome);
	
	InventarioEntity findByTipoItem(String tipo);

	InventarioEntity save(InventarioEntity inventarioEntity);
	
	InventarioEntity deleteById(Long id);
	

}

