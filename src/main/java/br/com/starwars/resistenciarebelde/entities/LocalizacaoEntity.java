package br.com.starwars.resistenciarebelde.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class LocalizacaoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String base;
	
	@Column(name = "nome_galaxia")
	private String nomeGalaxia;
	
	private double latitude;
	
	private double longitude;
	
	@JsonBackReference
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "rebelde_id_fk", referencedColumnName = "id_rebelde")
	@MapsId
	private RebeldeEntity rebelde;
	
	
	
}
