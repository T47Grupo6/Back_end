package com.generation.savenature.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome_categoria é Obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 3, max = 100, message = "O atributo nome_categoria deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome_categoria; 
	
	@NotNull(message = "O atributo descricao é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo descricao deve conter no mínimo 10 e no máximo 500 caracteres")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
