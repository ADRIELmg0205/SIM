package br.edu.unoesc.springboot.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.springboot.sim.model.setor;

@Repository
public interface SetorRepository extends JpaRepository<setor, Long> {
}
