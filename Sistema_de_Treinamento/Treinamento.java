import java.util.ArrayList;

public class Treinamento {

    private int id;
    private String nomeInstrutor;
    private String linguagemEnsinada;
    private ArrayList<Aluno> alunos;
    private int cargaHoraria;

    public Treinamento(int id, String nomeInstrutor, String linguagemEnsinada) {

        this.id = id;
        this.nomeInstrutor = nomeInstrutor;
        this.linguagemEnsinada = linguagemEnsinada;
        this.alunos = new ArrayList<>();
    }

    public boolean verificarDisponibilidade() {

        if (nomeInstrutor != null && !nomeInstrutor.isEmpty()) {
            return true;
        }

        return false;
    }

    public void definirCargaHoraria(int horas) {

        cargaHoraria = horas;

        System.out.println(
            "Carga horária definida: " + horas + " horas"
        );
    }

    public boolean verificarUltimoTreinamento(Aluno aluno) {

        if (cargaHoraria <= 80) {
            return true;
        }

        return false;
    }

    public double calcularMediaAlunos() {

        if (alunos.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Aluno aluno : alunos) {

            soma += aluno.getNotaFinal();
        }

        return soma / alunos.size();
    }

    public void adicionarAluno(Aluno aluno) {

        alunos.add(aluno);
    }

    public void mostrarTipo() {

        System.out.println("Treinamento normal");
    }
}
