package com.atv06.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
@RequestMapping("/api")
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@PutMapping("/calculadora")
	public Calculadora criaCalculadora(@RequestParam double v1,@RequestParam double v2,@RequestParam String operacao){
		
		if (operacao == null || operacao.trim().equals("")){
			throw new ResponseStatusException(
				HttpStatus.BAD_REQUEST, "a operacao deve ser preenchida"
			);
		}
		
		if (v2 == 0 && operacao.trim().equals("divisao")){
			throw new ResponseStatusException(
				HttpStatus.BAD_REQUEST, "divisao por zero nao permitida"
			);
		}

		return new Calculadora(v1, v2, operacao);
	}

}
