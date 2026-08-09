public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Isabela", 9.0);
        Aluno aluno2 = new Aluno("João", 8.0);
        Aluno aluno3 = new Aluno("Maria", 7.0);

        TreinamentoPresencial presencial =
                new TreinamentoPresencial(
                        1,
                        "Carlos",
                        "Java",
                        "Laboratório 1"
                );

        presencial.adicionarAluno(aluno1);
        presencial.adicionarAluno(aluno2);
        presencial.adicionarAluno(aluno3);

        presencial.definirCargaHoraria(40);

        System.out.println(
                "Instrutor disponível: "
                + presencial.verificarDisponibilidade()
        );

        System.out.println(
                "Média dos alunos: "
                + presencial.calcularMediaAlunos()
        );

        presencial.mostrarLocal();

        TreinamentoOnline online =
                new TreinamentoOnline(
                        2,
                        "Ana",
                        "Python",
                        "www.curso.com"
                );

        online.mostrarLink();
        online.mostrarTipo();
    }
}
