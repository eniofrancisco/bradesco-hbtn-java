import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Comida {
    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
        simbolos.setDecimalSeparator(',');

        DecimalFormat formatador = new DecimalFormat("0.000000", simbolos);

        String caloriasFormatadas = formatador.format((double) calorias);
        String precoFormatado = formatador.format(preco);

        return String.format("[%s] %s R$ %s", nome, caloriasFormatadas, precoFormatado);
    }
}
