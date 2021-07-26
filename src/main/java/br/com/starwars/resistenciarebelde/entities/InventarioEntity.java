package br.com.starwars.resistenciarebelde.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.starwars.resistenciarebelde.enums.TipoItem;
import lombok.Data;

@Entity
@Data
public class InventarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String quantidade;
	
	private TipoItem tipoItem;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "id_rebelde_fk", referencedColumnName = "id_rebelde")
	private RebeldeEntity rebelde;
	
	
}
