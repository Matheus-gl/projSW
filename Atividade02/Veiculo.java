package Atividade02;


import java.time.LocalDate;

public abstract class Veiculo{
    String nome;
    LocalDate dataProducao;
    double potencia;

    public Veiculo(String nome, LocalDate dataProducao, double potencia) {
        this.nome = nome;
        this.dataProducao = dataProducao;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = dataProducao;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public abstract int Deslocar();

    public abstract String Buzinar();

}

