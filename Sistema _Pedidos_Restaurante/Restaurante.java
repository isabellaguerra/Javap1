import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Pedido> pedidos;

    public Restaurante() {

        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {

        pedidos.add(pedido);

        System.out.println("Pedido adicionado.");
    }

    public void removerPedido(Pedido pedido) {

        if (pedidos.remove(pedido)) {

            System.out.println("Pedido removido.");

        } else {

            System.out.println("Pedido não encontrado.");
        }
    }

    public Pedido buscarPedido(int numero) {

        for (Pedido pedido : pedidos) {

            if (pedido.getNumero() == numero) {

                return pedido;
            }
        }

        return null;
    }

    public void listarPedidos() {

        if (pedidos.isEmpty()) {

            System.out.println(
                "Nenhum pedido cadastrado."
            );

            return;
        }

        for (Pedido pedido : pedidos) {

            pedido.mostrarPedido();
        }
    }
}
