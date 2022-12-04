package br.edu.unoesc.springboot.sim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.springboot.sim.model.cliente;

@Repository
public interface ClienteRepository extends JpaRepository<cliente, Long> {
	@Query(value = "select c from cliente c where upper(trim(c.nomecliente)) like %?1%")
	List<cliente> buscarPorNomeCliente(String nome);

	
}
