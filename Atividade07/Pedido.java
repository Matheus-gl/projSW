import java.sql.Date;

public class Pedido {
    int id;
    Date dataCriacao;
    StatusPedido status;
    Produto[] itens;
}
