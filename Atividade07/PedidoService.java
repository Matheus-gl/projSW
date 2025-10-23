public class PedidoService {
    public static void main(String args[]){
        PedidoFactory meuPedido = new PedidoFactory();
        IPedido pedidoP = meuPedido.criarPedido(TipoPedido.COMUM);
        pedidoP.processarPedido();
    }
}
