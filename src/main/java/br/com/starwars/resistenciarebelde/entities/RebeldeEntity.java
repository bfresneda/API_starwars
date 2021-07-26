package br.com.starwars.resistenciarebelde.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class RebeldeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rebelde")
    private Long id;
    
    private String nome;
    
    private String Especie;
    
    private String genero;

    @OneToOne(mappedBy = "rebelde")
    @PrimaryKeyJoinColumn
    @JsonManagedReference
    private LocalizacaoEntity localizacao;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "rebelde", cascade = CascadeType.PERSIST)
    private List<ReportadoEntity> reportacoes;
    
    
    @JsonManagedReference
    @OneToMany(mappedBy = "rebelde", cascade = CascadeType.PERSIST)
    private List<InventarioEntity> inventario;
    
}
