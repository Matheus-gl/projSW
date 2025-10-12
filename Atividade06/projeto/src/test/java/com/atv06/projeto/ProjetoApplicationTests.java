package com.atv06.projeto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProjetoApplicationTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void deveRetornarErroQuandoOperacaoVazia() throws Exception {
        mockMvc.perform(put("/api/calculadora")
                        .param("v1", "10")
                        .param("v2", "5")
                        .param("operacao", ""))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Operação não pode ser vazia"));
    }

    @Test
    void deveRetornarErroQuandoDivisaoPorZero() throws Exception {
        mockMvc.perform(put("/api/calculadora")
                        .param("v1", "10")
                        .param("v2", "0")
                        .param("operacao", "divisao"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Divisão por zero"));
    }

    @Test
    void deveRetornarResultadoCorretoParaSoma() throws Exception {
        mockMvc.perform(put("/api/calculadora")
                        .param("v1", "5")
                        .param("v2", "3")
                        .param("operacao", "soma"))
                .andExpect(status().isOk())
                .andExpect(content().string("8.0"));
    }

    @Test
    void deveRetornarResultadoCorretoParaExponenciacao() throws Exception {
        mockMvc.perform(put("/api/calculadora")
                        .param("v1", "2")
                        .param("v2", "3")
                        .param("operacao", "exponenciacao"))
                .andExpect(status().isOk())
                .andExpect(content().string("8.0"));
    }

    @Test
    void deveRetornarErroParaOperacaoInvalida() throws Exception {
        mockMvc.perform(put("/api/calculadora")
                        .param("v1", "2")
                        .param("v2", "3")
                        .param("operacao", "raiz"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Operação inválida"));
    }
}
