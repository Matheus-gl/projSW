package com.atv07.ConfigSys;

public enum ConfiguracaoSistema {
    INSTANCE;

    String nomeloja = "Loja Exemplo";
    double taxaDesconto = 0.9;

    private ConfiguracaoSistema() {}

    public static ConfiguracaoSistema getInstance() {
        return INSTANCE;
    }

    public double aplicarDesconto(double valor) {
        return valor * taxaDesconto;
    }
}
