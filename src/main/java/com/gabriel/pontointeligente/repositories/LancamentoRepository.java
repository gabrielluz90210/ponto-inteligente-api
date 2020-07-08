package com.gabriel.pontointeligente.repositories;

import java.awt.print.Pageable;
import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import com.gabriel.pontointeligente.entities.Lancamento;

// JPQL
@Transactional(readOnly = true)
@NamedQueries({ // anotação, pode criar várias queries
	@NamedQuery(name = "LancamentoRepository.findByFuncionarioId", // nome da classe seguido com nome do método
			query = "Select lanc from Lancamento lanc where lanc.funcionario.id = :funcionarioId") })
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);
	
	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pegeable); // fazer paginação, passar o range de retorno

}
