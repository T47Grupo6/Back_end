package com.generation.savenature.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.savenature.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	public List <Produto> findByNomeProdutoAndDescricaoProduto(String nomeProduto, String descricaoProduto);
	public List <Produto> findByNomeProdutoOrDescricaoProduto(String nomeProduto, String descricaoProduto);
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
	@Query(value = "select * from tb_produto where preco between :inicio and :fim", nativeQuery = true)
	public List <Produto> buscarProdutosEntre(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);
}
