package com.gabriel.pontointeligente.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations="classpath:application.properties")
@ActiveProfiles("test")

public class PontoInteligenteApplicationTests {

	@Test
	public void contextLoads() {
	}

}

