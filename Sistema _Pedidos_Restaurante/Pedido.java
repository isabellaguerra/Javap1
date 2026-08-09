import java.util.ArrayList;

public class Pedido {

    private int numero;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero) {

        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public double calcularTotalPedido() {

        double total = 0;

        for (ItemPedido item : itens) {

            total += item.calcularSubtotal();
        }

        double taxaEntrega = 10.0;

        total += taxaEntrega;

        return total;
    }

    public void adicionarItem(ItemPedido item) {

        itens.add(item);

        System.out.println("Item adicionado.");
    }

    public void removerItem(ItemPedido item) {

        if (itens.remove(item)) {

            System.out.println("Item removido.");

        } else {

            System.out.println("Item não encontrado.");
        }
    }

    public void reservarMesa(int numeroMesa) {

        System.out.println(
            "Mesa " + numeroMesa
            + " reservada para o pedido "
            + numero
        );
    }

    public int getNumero() {

        return numero;
    }

    public void mostrarPedido() {

        System.out.println(
            "Pedido número: " + numero
        );

        for (ItemPedido item : itens) {

            System.out.println(
                item.getNomeDoPrato()
            );
        }

        System.out.println(
            "Total: R$ "
            + calcularTotalPedido()
        );
    }
}
