package com.gabriel.pontointeligente.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // usando configuracoes de teste
public class EmpresaRepositoryTest {

	@Autowired
	EmpresaRepository empresaRepository;
	
//	private static final String CNPJ = "51463645000100"; 
//	
//	@Before // Executa operacao antes do teste
//	public void setUp() throws Exception {
//		// Cadastrando uma empresa qualquer - Banco H2
//		Empresa empresa = new Empresa();
//		empresa.setRazaoSocial("Empresa Exemplo");
//		empresa.setCnpj(CNPJ);
//		this.empresaRepository.save(empresa);
//	}
//	
//	@After // executa após a execução do teste
//	public final void tearDown() {
//		// Remover todas as empresas
//		this.empresaRepository.deleteAll();
//	}
//	
//	@Test
//	public void testBuscarPorCnpj() {
//		Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);
//		
//		assertEquals(CNPJ, empresa.getCnpj());
//	}
	
}
