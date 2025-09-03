public class Program {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        try {
            PessoasArray p = new PessoasArray();
            p.buscaLinear("Otavio");
            p.buscaLinear("Isabela");
            p.buscaLinear("Anderson"); // Deve lançar exceção
        } finally {
            System.out.println("Tempo de execução: " + (System.nanoTime() - inicio));
        }
    }
}
