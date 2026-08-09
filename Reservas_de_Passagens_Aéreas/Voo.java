public class Voo {

    private String numeroVoo;
    private String origem;
    private String destino;
    private int assentosDisponiveis;

    public Voo(
            String numeroVoo,
            String origem,
            String destino,
            int assentosDisponiveis) {

        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public boolean verificarDisponibilidade(int quantidadeAssentos) {

        return quantidadeAssentos > 0
                && quantidadeAssentos <= assentosDisponiveis;
    }

    public void realizarReserva(int quantidadeAssentos) {

        if (verificarDisponibilidade(quantidadeAssentos)) {

            assentosDisponiveis -= quantidadeAssentos;

            System.out.println(
                "Reserva realizada com sucesso!"
            );

        } else {

            System.out.println(
                "Não há assentos suficientes."
            );
        }
    }

    public double realizarPagamento(
            String tipoViagem,
            boolean pontosTuristicos) {

        double valor = 500.0;

        if (tipoViagem.equalsIgnoreCase("ida e volta")) {

            valor = valor * 2;
        }

        if (pontosTuristicos) {

            valor = valor + 100;
        }

        return valor;
    }

    public void imprimirPassagem() {

        System.out.println("----------------------");
        System.out.println("Número do voo: " + numeroVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println(
            "Assentos disponíveis: "
            + assentosDisponiveis
        );
        System.out.println("----------------------");
    }

    public String getNumeroVoo() {

        return numeroVoo;
    }
}
