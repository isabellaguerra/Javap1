import java.util.ArrayList;

public class Aeroporto {

    private ArrayList<Voo> voos;

    public Aeroporto() {

        voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {

        voos.add(voo);

        System.out.println("Voo adicionado.");
    }

    public void removerVoo(Voo voo) {

        if (voos.remove(voo)) {

            System.out.println("Voo removido.");

        } else {

            System.out.println("Voo não encontrado.");
        }
    }

    public Voo buscarVoo(String numero) {

        for (Voo voo : voos) {

            if (voo.getNumeroVoo().equals(numero)) {

                return voo;
            }
        }

        return null;
    }

    public void listarVoos() {

        if (voos.isEmpty()) {

            System.out.println("Nenhum voo disponível.");

            return;
        }

        for (Voo voo : voos) {

            voo.imprimirPassagem();
        }
    }
}
