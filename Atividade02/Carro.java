package Atividade02;

import java.sql.Date;

public class Carro extends Veiculo {
    public Carro(String nome, Date dataProducao, double potencia) {
        super(nome, dataProducao, potencia);
    }

    int NumPassageiros;

    @Override
    public int Deslocar() {
        return (int) (getPotencia() * 10);
    }

    @Override
    public String Buzinar() {
        return "bi-biii";
    }
}
