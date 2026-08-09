public class TreinamentoPresencial extends Treinamento {

    private String local;

    public TreinamentoPresencial(
            int id,
            String nomeInstrutor,
            String linguagemEnsinada,
            String local) {

        super(id, nomeInstrutor, linguagemEnsinada);

        this.local = local;
    }

    public void mostrarLocal() {

        System.out.println("Local: " + local);
    }

    @Override
    public void mostrarTipo() {

        System.out.println("Treinamento presencial");
    }
}
