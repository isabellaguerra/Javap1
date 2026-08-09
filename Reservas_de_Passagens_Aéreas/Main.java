public class Main {

    public static void main(String[] args) {

        Voo voo1 = new Voo(
                "LA123",
                "São Paulo",
                "Rio de Janeiro",
                50
        );

        Voo voo2 = new Voo(
                "AZ456",
                "São Paulo",
                "Salvador",
                30
        );

        Aeroporto aeroporto = new Aeroporto();

        aeroporto.adicionarVoo(voo1);
        aeroporto.adicionarVoo(voo2);

        System.out.println();

        voo1.realizarReserva(5);

        System.out.println();

        voo1.imprimirPassagem();

        System.out.println();

        double valor = voo1.realizarPagamento(
                "ida e volta",
                true
        );

        System.out.println(
                "Valor da passagem: R$ " + valor
        );

        System.out.println();

        aeroporto.listarVoos();

        System.out.println();

        Voo encontrado = aeroporto.buscarVoo("LA123");

        if (encontrado != null) {

            System.out.println("Voo encontrado!");

        } else {

            System.out.println("Voo não encontrado.");
        }
    }
}
