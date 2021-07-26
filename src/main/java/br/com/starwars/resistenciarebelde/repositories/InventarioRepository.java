package br.com.starwars.resistenciarebelde.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.starwars.resistenciarebelde.entities.InventarioEntity;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioEntity, Long>{

	List<InventarioEntity> findByNome(String nome);

	List<InventarioEntity> findByTipoItem(String tipo);
	
}
