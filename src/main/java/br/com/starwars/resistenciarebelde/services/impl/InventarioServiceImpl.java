package br.com.starwars.resistenciarebelde.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starwars.resistenciarebelde.entities.InventarioEntity;
import br.com.starwars.resistenciarebelde.repositories.InventarioRepository;
import br.com.starwars.resistenciarebelde.services.InventarioService;

@Service
public class InventarioServiceImpl implements InventarioService {

	@Autowired
	private InventarioRepository inventarioRepository;
	
	
	@Override
	public List<InventarioEntity> findall() {
		return inventarioRepository.findAll();
	}

	@Override
	public InventarioEntity findById(Long id) {
		inventarioRepository.findById(id);
		return null;
	}

	@Override
	public InventarioEntity findByNome(String nome) {
		inventarioRepository.findByNome(nome);
		return null;
	}

	@Override
	public InventarioEntity findByTipoItem(String tipo) {
		inventarioRepository.findByTipoItem(tipo);
		return null;
	}

	@Override
	public InventarioEntity save(InventarioEntity inventarioEntity) {
		inventarioRepository.save(inventarioEntity);
		return null;
	}

	@Override
	public InventarioEntity deleteById(Long id) {
		inventarioRepository.deleteById(id);
		return null;
	}

	
	
}
