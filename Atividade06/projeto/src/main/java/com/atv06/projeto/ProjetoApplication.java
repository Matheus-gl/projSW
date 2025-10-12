package com.atv06.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class ProjetoApplication {

	@Autowired
    private Calculadora calculadora;

	@PutMapping("/calculadora")
	public ResponseEntity<?> criaCalculadora(@RequestParam double v1,@RequestParam double v2,@RequestParam String operacao){
		try {
            double resultado = calculadora.calcular(v1, v2, operacao);
            return ResponseEntity.ok(resultado);
        } catch (IllegalArgumentException | UnsupportedOperationException | ArithmeticException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
		
		}

	}
}