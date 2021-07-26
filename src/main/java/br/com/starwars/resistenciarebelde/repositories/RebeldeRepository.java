package br.com.starwars.resistenciarebelde.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.starwars.resistenciarebelde.entities.RebeldeEntity;

@Repository
public interface RebeldeRepository extends JpaRepository<RebeldeEntity, Long> {
	
	List<RebeldeEntity> findByNome(String nome); 
	
}
