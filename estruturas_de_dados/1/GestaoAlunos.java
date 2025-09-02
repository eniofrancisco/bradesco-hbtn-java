import java.util.ArrayList;
import java.util.List;
public class GestaoAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(String nome, int idade) {
        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno);
    }

    public void excluirAluno(String nome) {
        boolean removido = alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Aluno removido: " + nome);
        } else {
            System.out.println("Aluno não encontrado: " + nome);
        }
    }

    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno);
                return;
            }
        }
        System.out.println("Aluno não encontrado: " + nome);
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos cadastrados:");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }
}
