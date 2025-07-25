public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    // Getter para saudeAtual
    public int getSaudeAtual() {
        return saudeAtual;
    }

    // Setter para saudeAtual
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo para aplicar dano
    public void tomarDano(int quantidadeDeDano) {
        saudeAtual -= quantidadeDeDano;
        if (saudeAtual < 0) {
            saudeAtual = 0;
        }
    }

    // Metodo para receber cura
    public void receberCura(int quantidadeDeCura) {
        saudeAtual += quantidadeDeCura;
        if (saudeAtual > 100) {
            saudeAtual = 100;
        }
    }
}
