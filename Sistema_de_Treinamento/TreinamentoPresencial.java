public class TreinamentoOnline extends Treinamento {

    private String linkAcesso;

    public TreinamentoOnline(
            int id,
            String nomeInstrutor,
            String linguagemEnsinada,
            String linkAcesso) {

        super(id, nomeInstrutor, linguagemEnsinada);

        this.linkAcesso = linkAcesso;
    }

    public void mostrarLink() {

        System.out.println("Link: " + linkAcesso);
    }

    @Override
    public void mostrarTipo() {

        System.out.println("Treinamento online");
    }
}
