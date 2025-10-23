public class PedidoFactory {
    public IPedido criarPedido(TipoPedido tipo){
        if (tipo == TipoPedido.COMUM) {
            return new PedidoComum();
        } else if ( tipo == TipoPedido.EXPRESSO) {
            return new PedidoExpresso();
        }
        return null;
    }
}
