package br.edu.unoesc.springboot.sim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.springboot.sim.model.produto;

/**
* 
* @author Adriel/Gustavo
* @version 1.0
* 
*/

@Repository
public interface ProdutoRepository extends JpaRepository<produto, Long> {
	@Query(value = "select p from produto p where upper(trim(p.referenciaproduto)) like %?1%")
	List<produto> buscarPorNomeProduto(String nome);

	
}