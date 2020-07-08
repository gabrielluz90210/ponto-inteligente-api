package com.gabriel.pontointeligente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.gabriel.pontointeligente.entities.Empresa;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Transactional(readOnly = true) // Nao transaciona o bd
	Empresa findByCnpj(String cnpj);

}
