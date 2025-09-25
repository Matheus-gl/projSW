package com.atv06.projeto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(ProjetoApplication.class)
class ProjetoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testeCriaCalculadoraComOperacaoVazia() throws Exception {
		String operacao = "";
		double v1 = 10;
		double v2 = 10;

		mockMvc.perform(MockMvcRequestBuilders.put("/api/calculadora")
				.param("v1", String.valueOf(v1))
				.param("v2", String.valueOf(v2))
				.param("operacao", operacao))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	public void testCriarCalculadoraComDivisaoPorZero() throws Exception {
		String operacao = "divisao";
		double v1 = 10;
		double v2 = 0;

		mockMvc.perform(MockMvcRequestBuilders.put("/api/calculadora")
				.param("v1", String.valueOf(v1))
				.param("v2", String.valueOf(v2))
				.param("operacao", operacao))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}


}
