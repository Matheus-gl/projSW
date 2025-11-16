package com.atv07;

import com.atv07.Interfaces.IPedido;

public class PedidoExpresso implements IPedido {

    @Override
    public void processarPedido() {
        System.out.println("pedido expresso");
    }
    
}
