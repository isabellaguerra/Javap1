public class Main {

    public static void main(String[] args) {

        ItemPedido item1 =
                new ItemPedido(
                        "Hambúrguer",
                        2,
                        20.00
                );

        ItemPedido item2 =
                new ItemPedido(
                        "Refrigerante",
                        1,
                        8.00
                );

        Pedido pedido1 = new Pedido(1);

        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        System.out.println();

        double total = pedido1.calcularTotalPedido();

        System.out.println(
                "Total do pedido: R$ " + total
        );

        System.out.println();

        pedido1.reservarMesa(5);

        System.out.println();

        pedido1.mostrarPedido();

        System.out.println();

        Restaurante restaurante =
                new Restaurante();

        restaurante.adicionarPedido(pedido1);

        System.out.println();

        restaurante.listarPedidos();

        System.out.println();

        Pedido encontrado =
                restaurante.buscarPedido(1);

        if (encontrado != null) {

            System.out.println(
                "Pedido encontrado!"
            );

        } else {

            System.out.println(
                "Pedido não encontrado."
            );
        }
    }
}
