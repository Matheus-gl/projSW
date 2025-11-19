package com.atv07;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    public static void main(String[] args) {
		SpringApplication.run(PedidoController.class, args);
	}

    @Autowired
    private PedidoService pedidoService;
    
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedidoRequest) {
        return pedidoService.processarEnvio(pedidoRequest.itens, pedidoRequest.tipoPedido);
    }

    
    @GetMapping("/{id}")
        public Pedido buscarPedido(@PathVariable int id) {
        return pedidoService.buscarPedido(id);
    }
}
