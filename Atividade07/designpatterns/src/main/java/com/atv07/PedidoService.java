package com.atv07;

import java.util.Date;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.atv07.ConfigSys.ConfiguracaoSistema;
import com.atv07.Interfaces.ILogistica;
import com.atv07.Interfaces.ILogisticaLegado;
import com.atv07.Interfaces.IPedido;
import com.atv07.Repositorios.PedidoRepository;

@Service
public class PedidoService {
    
    private final PedidoFactory pedidoFactory;
    private final LogisticaAdapter logistica;
    private final ConfiguracaoSistema config;
    private final PedidoRepository pedidoRepository;

    public PedidoService(LogisticaAdapter logistica,
                         PedidoRepository pedidoRepository) {

        this.pedidoFactory = new PedidoFactory();
        this.config = ConfiguracaoSistema.INSTANCE;
        this.pedidoRepository = pedidoRepository;
        this.logistica = logistica;
    }

    public double aplicarDesconto(double valor) {
        return config.aplicarDesconto(valor);
    }

    public Pedido processarEnvio(List<String> itens, TipoPedido tipoPedido) {
        Pedido pedido = criarPedido(itens, tipoPedido);
        enviarPedido(pedido);
        return pedido;
    }

    public void enviarPedido(Pedido pedido) {
        logistica.enviar(pedido);
    }

    public Pedido criarPedido(List<String> itens, TipoPedido tipoPedido) {
        IPedido pedidoProcessavel = pedidoFactory.criarPedido(tipoPedido);
        pedidoProcessavel.processarPedido();
        
        Pedido pedido = new Pedido();
        pedido.dataCriacao = new Date();
        pedido.itens = itens;
        pedido.tipoPedido = tipoPedido;

        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedido(int id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElse(null); 
    }
         
}