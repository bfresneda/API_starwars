package br.com.starwars.resistenciarebelde.services;

import java.util.List;

import br.com.starwars.resistenciarebelde.entities.ReportadoEntity;

public interface ReportadoService {

	List<ReportadoEntity> finAll();	
	
	ReportadoEntity findById(final Long Id);
	
	ReportadoEntity save(ReportadoEntity reportadoEntity);
	
	ReportadoEntity deleteById(final Long Id);
	
}
