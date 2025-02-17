public class ForEmEach {

    public static void main(String[] args) {

        System.out.println("alunos:");
        String alunos[] = { "joao", "maria", "pedro", "ana" };

        for (String aluno : alunos) {
            System.out.println("Aluno:" + aluno);
        }
    }
}
