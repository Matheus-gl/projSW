package com.atv06.projeto;
import org.springframework.stereotype.Service;

@Service
public class Calculadora {
    double v1, v2;
    String operacao;
    
    public double calcular(double v1, double v2, String operacao) {
        if (operacao == null || operacao.isBlank()) {
            throw new IllegalArgumentException("Operação não pode ser vazia");
        }

        operacao = operacao.toLowerCase();

        if (operacao.equals("adição") || operacao.equals("soma")) {
            return adicao(v1, v2);
        } else if (operacao.equals("subtração") || operacao.equals("subtracao")) {
            return subtracao(v1, v2);
        } else if (operacao.equals("multiplicação") || operacao.equals("multiplicacao")) {
            return multiplicacao(v1, v2);
        } else if (operacao.equals("divisão") || operacao.equals("divisao")) {
            return divisao(v1, v2);
        } else if (operacao.equals("exponenciação") || operacao.equals("exponenciacao")) {
            return exponenciacao(v1, v2);
        } else {
            throw new UnsupportedOperationException("Operação inválida");
        }
    }

    public double adicao(double var1, double var2) {
        return var1 + var2;
    }

    public double subtracao(double var1, double var2) {
        return var1 - var2;
    }

    public double divisao(double var1, double var2) {
        if (var2 == 0) throw new ArithmeticException("Divisão por zero");
        return var1 / var2;
    }

    public double multiplicacao(double var1, double var2) {
        return var1 * var2;
    }

    public double exponenciacao(double var1, double var2) {
        return Math.pow(var1, var2);
    }
}
