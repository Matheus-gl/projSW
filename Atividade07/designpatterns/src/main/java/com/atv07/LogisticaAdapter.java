package com.atv07;

import org.springframework.stereotype.Component;

import com.atv07.Interfaces.ILogistica;
import com.atv07.Interfaces.ILogisticaLegado;

@Component
public class LogisticaAdapter implements ILogistica {
    ILogisticaLegado logisticaLegado;
    String endereco;

    public LogisticaAdapter(ILogisticaLegado logisticaLegado, String endereco) {
        this.logisticaLegado = logisticaLegado;
        this.endereco = endereco;
    }

    @Override
    public void enviar(Pedido pedido) {
        String codigoRastreio = "P" + pedido.id + "-" + System.currentTimeMillis();

        logisticaLegado.enviarPacote(endereco, codigoRastreio);
        System.out.println(" - enviado via logística"); 
    }

}
