package br.com.starwars.resistenciarebelde.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.starwars.resistenciarebelde.entities.ReportadoEntity;

@Repository
public interface ReportadoRepository extends JpaRepository<ReportadoEntity, Long>{

}
