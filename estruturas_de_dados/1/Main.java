public class Main {
    public static void main(String[] args) {
        // Instanciando o gerenciador de alunos
        GestaoAlunos gestao = new GestaoAlunos();
        // ✅ Adicionando três alunos
        gestao.adicionarAluno("Alice", 20);
        gestao.adicionarAluno("Bruno", 22);
        gestao.adicionarAluno("Carla", 19);
        // 📋 Exibindo a lista de alunos
        System.out.println("\n--- Lista de Alunos ---");
        gestao.listarAlunos();
        // 🔍 Buscando por um aluno existente
        System.out.println("\n--- Buscar Aluno: Bruno ---");
        gestao.buscarAluno("Bruno");
        // ❌ Excluindo um aluno existente
        System.out.println("\n--- Excluir Aluno: Alice ---");
        gestao.excluirAluno("Alice");
        // ❌ Tentando excluir um aluno inexistente
        System.out.println("\n--- Excluir Aluno: Daniel ---");
        gestao.excluirAluno("Daniel");
        // 🔍 Buscando por um aluno que foi excluído
        System.out.println("\n--- Buscar Aluno: Alice ---");
        gestao.buscarAluno("Alice");
        // 📋 Exibindo a lista final de alunos
        System.out.println("\n--- Lista Final de Alunos ---");
        gestao.listarAlunos();
    }
}
