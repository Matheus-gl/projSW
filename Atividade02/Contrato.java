package Atividade02;

import java.sql.Date;

public class Contrato {
    Veiculo alugado;
    Date dataRetirada;
    Date dataDevolucao;

    public Contrato(Veiculo alugado, Date dataRetirada, Date dataDevolucao) {
        this.alugado = alugado;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo getAlugado() {
        return alugado;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
