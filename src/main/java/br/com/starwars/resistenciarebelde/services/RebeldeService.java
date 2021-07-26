package br.com.starwars.resistenciarebelde.services;

import java.util.List;
import java.util.Optional;

import br.com.starwars.resistenciarebelde.entities.RebeldeEntity;

public interface RebeldeService {

    List<RebeldeEntity> findAll();

    Optional<RebeldeEntity> findById(final Long id);

    RebeldeEntity save(RebeldeEntity rebeldeEntity);

    RebeldeEntity deleteById(final Long id);

}
