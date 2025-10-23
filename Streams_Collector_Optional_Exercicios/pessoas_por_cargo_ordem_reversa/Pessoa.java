import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        String salarioFormatado = String.format(Locale.US, "%.6f", salario).replace('.', ',');
        return String.format("[%d] %s %s %d R$ %s", codigo, nome, cargo, idade, salarioFormatado);
    }

    @Override
    public int compareTo(Pessoa outra) {
        int nomeComp = this.nome.compareTo(outra.nome);
        if (nomeComp != 0) return nomeComp;
        return Integer.compare(this.codigo, outra.codigo); // desempate por código
    }
}
