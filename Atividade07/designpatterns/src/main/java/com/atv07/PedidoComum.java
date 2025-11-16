package com.atv07;

import com.atv07.Interfaces.IPedido;

public class PedidoComum implements IPedido {

    @Override
    public void processarPedido() {
        System.out.print("pedido comum");
    }
    
}
