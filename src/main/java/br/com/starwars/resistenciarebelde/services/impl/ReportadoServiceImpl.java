package br.com.starwars.resistenciarebelde.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starwars.resistenciarebelde.entities.ReportadoEntity;
import br.com.starwars.resistenciarebelde.repositories.ReportadoRepository;
import br.com.starwars.resistenciarebelde.services.ReportadoService;

@Service
public class ReportadoServiceImpl implements ReportadoService {

	@Autowired
	private ReportadoRepository reportadoRepository;
	
	@Override
	public List<ReportadoEntity> finAll() {
		return reportadoRepository.findAll();
	}

	@Override
	public ReportadoEntity findById(Long Id) {
		reportadoRepository.findById(Id);
		return null;
	}

	@Override
	public ReportadoEntity save(ReportadoEntity reportadoEntity) {
		reportadoRepository.save(reportadoEntity);
		return reportadoEntity;
	}

	@Override
	public ReportadoEntity deleteById(Long Id) {
		reportadoRepository.deleteById(Id);
		return null;
	}

}
