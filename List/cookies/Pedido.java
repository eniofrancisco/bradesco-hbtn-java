import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    // Construtor
    public Pedido() {
        cookies = new ArrayList<>();
    }

    // Adiciona um PedidoCookie à lista
    public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
    }

    // Retorna o total de caixas encomendadas
    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    // Remove todos os pedidos de um sabor específico e retorna o total de caixas removidas
    public int removerSabor(String sabor) {
        int caixasRemovidas = 0;
        ArrayList<PedidoCookie> paraRemover = new ArrayList<>();

        for (PedidoCookie cookie : cookies) {
            if (cookie.getSabor().equalsIgnoreCase(sabor)) {
                caixasRemovidas += cookie.getQuantidadeCaixas();
                paraRemover.add(cookie);
            }
        }

        cookies.removeAll(paraRemover);
        return caixasRemovidas;
    }
}
