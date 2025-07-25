public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    // Getter para saudeAtual
    public int getSaudeAtual() {
        return saudeAtual;
    }

    // Setter para saudeAtual com lógica de status
    public void setSaudeAtual(int saudeAtual) {
        if (saudeAtual < 0) {
            this.saudeAtual = 0;
        } else if (saudeAtual > 100) {
            this.saudeAtual = 100;
        } else {
            this.saudeAtual = saudeAtual;
        }

        if (this.saudeAtual > 0) {
            status = "vivo";
        } else {
            status = "morto";
        }
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para status (apenas leitura)
    public String getStatus() {
        return status;
    }

    // Método para aplicar dano usando o setter
    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(this.saudeAtual - quantidadeDeDano);
    }

    // Método para receber cura usando o setter
    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(this.saudeAtual + quantidadeDeCura);
    }
}
