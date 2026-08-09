public class ItemPedido {

    private String nomeDoPrato;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(
            String nomeDoPrato,
            int quantidade,
            double precoUnitario) {

        this.nomeDoPrato = nomeDoPrato;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {

        return quantidade * precoUnitario;
    }

    public String getNomeDoPrato() {

        return nomeDoPrato;
    }
}
