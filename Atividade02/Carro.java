package Atividade02;

import java.sql.Date;

public class Carro extends Veiculo {
    public Carro(String nome, Date dataProducao, double potencia) {
        super(nome, dataProducao, potencia);
        //TODO Auto-generated constructor stub
    }

    int NumPassageiros;

    @Override
    public int Deslocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Deslocar'");
    }

    @Override
    public String Buzinar() {
        // TODO Auto-generated method stub
        return "bi-biii";
    }
}
