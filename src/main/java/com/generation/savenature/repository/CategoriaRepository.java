package com.generation.savenature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.savenature.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

  public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);
  
}