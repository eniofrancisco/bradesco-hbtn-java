import produtos.Produto;
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total * (1 - percentualDesconto / 100);
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        double totalProdutos = 0.0;

        for (ItemPedido item : itens) {
            String tipo = item.getProduto().getClass().getSimpleName();
            String titulo = item.getProduto().getTitulo();
            double preco = item.getProduto().obterPrecoLiquido();
            int quantidade = item.getQuantidade();
            double subtotal = item.calcularSubtotal();

            totalProdutos += subtotal;

            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n",
                    tipo, titulo, preco, quantidade, subtotal);
        }

        double desconto = totalProdutos * (percentualDesconto / 100);
        double totalPedido = calcularTotal();

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f%n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f%n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f%n", totalPedido);
        System.out.println("----------------------------");
    }
}
