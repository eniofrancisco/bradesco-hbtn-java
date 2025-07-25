public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    // Construtor com saude e nome iniciais
    public PersonagemGame(int saudeInicial, String nomeInicial) {
        setSaudeAtual(saudeInicial);
        setNome(nomeInicial);
    }

    // Getter para saudeAtual
    public int getSaudeAtual() {
        return saudeAtual;
    }

    // Setter para saudeAtual com logica de status
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

    // Setter para nome com validacao
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
        // Se for nulo ou vazio, mantem o nome atual
    }

    // Getter para status (apenas leitura)
    public String getStatus() {
        return status;
    }

    // Metodo para aplicar dano usando o setter
    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(this.saudeAtual - quantidadeDeDano);
    }

    // Metodo para receber cura usando o setter
    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(this.saudeAtual + quantidadeDeCura);
    }
}
