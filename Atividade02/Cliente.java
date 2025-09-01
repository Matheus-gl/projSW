package Atividade02;

import java.sql.Date;

public class Cliente extends Pessoa {
    
    Contrato[] alugueis;

    public Cliente(String nome) {
        super(nome);
        this.alugueis = new Contrato[10];
    }

    public boolean alugar (Veiculo v){
        Date dataAtual = new Date(System.currentTimeMillis());
        for(int i = 0;i < alugueis.length ;i++){
            if (alugueis[i] == null){
                alugueis[i] = new Contrato(v,dataAtual,null);
                return true;
            }
        }
        return false;
    }

    public boolean devolver (Veiculo v){
        Date dataDevol = new Date(System.currentTimeMillis());
        for (Contrato c : alugueis){
            if (c != null && c.getAlugado().equals(v) && c.getDataDevolucao() == null){
                c.setDataDevolucao(dataDevol);
                return true;
            }
        }
        return false;
    }
}
