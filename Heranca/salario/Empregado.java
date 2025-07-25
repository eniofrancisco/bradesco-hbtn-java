public class Empregado {
    // Atributo
    private double salarioFixo;

    // Construtor
    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    // Getter
    public double getSalarioFixo() {
        return salarioFixo;
    }

    // Metodo para calcular bonus com base na meta
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            // Exemplo: bonus de 10% do salario fixo se atingir a meta
            return salarioFixo * 0.10;
        } else {
            // Sem bonus se nao atingir a meta
            return 0.0;
        }
    }

    // Metodo para calcular salario total com bonus
    public double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
    }
}
