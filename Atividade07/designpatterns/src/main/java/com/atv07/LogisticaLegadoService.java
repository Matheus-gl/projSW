package com.atv07;

import org.springframework.stereotype.Component;

import com.atv07.Interfaces.ILogisticaLegado;

@Component
public class LogisticaLegadoService implements ILogisticaLegado {

    @Override
    public void enviarPacote(String endereco, String codigoRastreio) {
        System.out.println("pedido enviado para: " + endereco + " com codigo de rastreio: " + codigoRastreio);
    }
    
}
