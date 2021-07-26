package br.com.starwars.resistenciarebelde.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starwars.resistenciarebelde.entities.RebeldeEntity;
import br.com.starwars.resistenciarebelde.repositories.RebeldeRepository;
import br.com.starwars.resistenciarebelde.services.RebeldeService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RebeldeServiceImpl implements RebeldeService {

	@Autowired
    private final RebeldeRepository rebeldeRepository;
	
	@Override
	public List<RebeldeEntity> findAll() {
		return rebeldeRepository.findAll();
	}

	@Override
	public Optional<RebeldeEntity> findById(Long id) {
		return rebeldeRepository.findById(id);
	}

	@Override
	public RebeldeEntity save(RebeldeEntity rebeldeEntity) {
		return rebeldeRepository.save(rebeldeEntity);
	}

	@Override
	public RebeldeEntity deleteById(Long id) {
		rebeldeRepository.deleteById(id);
		return null;
	}

}
