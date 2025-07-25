public class Gerente extends Empregado {
    
    // Construtor usando o da superclasse
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    // Sobrescrevendo o metodo calcularBonus
    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            // Gerentes recebem um bonus maior, por exemplo 20%
            return getSalarioFixo() * 0.20;
        } else {
            // Sem bonus se nao atingir a meta
            return 0.0;
        }
    }
}
