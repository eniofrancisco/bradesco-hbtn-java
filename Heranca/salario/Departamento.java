public class Departamento {
    // Atributos
    private double valorMeta;
    private double valorAtingidoMeta;

    // Construtor
    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    // Getters
    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    // Metodo para verificar se a meta foi alcancada
    public boolean alcancouMeta() {
        return valorAtingidoMeta >= valorMeta;
    }
}
