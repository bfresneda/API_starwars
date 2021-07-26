package br.com.starwars.resistenciarebelde.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.starwars.resistenciarebelde.entities.LocalizacaoEntity;

@Repository
public interface LocalizacaoRepository extends JpaRepository<LocalizacaoEntity, Long>{

	List<LocalizacaoEntity> findByNomeGalaxia(String nome);
}
