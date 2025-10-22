import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Produto {
    private int codigo;
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
	public String toString() {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
		symbols.setDecimalSeparator(',');
		DecimalFormat df = new DecimalFormat("0.00", symbols);
		return String.format("[%d] %s %s R$ %s", codigo, nome, categoria, df.format(preco));
	}

    public CategoriaProduto getCategoria() {
        return categoria;
    }
	
	public double getPreco() {
		return preco;
	}
}
