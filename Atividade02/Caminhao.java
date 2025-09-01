package Atividade02;

import java.sql.Date;

public class Caminhao extends Veiculo {

    private int capacidade;

    public Caminhao(String nome, Date dataProducao, double potencia, int capacidade) {
        super(nome, dataProducao, potencia);
        this.capacidade = capacidade;
        //TODO Auto-generated constructor stub
    }

    public int getCapacidade(){
        return capacidade;
    }
    

    public int transportar(){
        System.out.println("caminhao transportando: " + getCapacidade() + " toneladas");
        return getCapacidade();
    }

    public int transportar(int carga){
        if(carga <= capacidade){
            int cargaAtual = getCapacidade() - carga;
            System.out.println("caminhao esta atualmente carregado com: " + cargaAtual + " toneladas");
            return cargaAtual;
        }else{
            System.out.println(getNome() + " não pode transportar " + carga + " toneladas! Capacidade máxima: " + getCapacidade() + " toneladas.");
            return getCapacidade();
        }
    }

    @Override
    public int Deslocar() {
        return (int) (getPotencia() * 10);
    }

    @Override
    public String Buzinar() {
        return "fom-fooom";
    }
}
