import java.util.*;

public class Blog {
    private List<Post> postagens;

    // Construtor
    public Blog() {
        postagens = new ArrayList<>();
    }

    // Adiciona uma postagem à lista
    public void adicionarPostagem(Post postagem) {
        postagens.add(postagem);
    }

    // Retorna autores únicos e ordenados
    public Set<String> obterTodosAutores() {
        Set<String> autoresOrdenados = new TreeSet<>();
        for (Post postagem : postagens) {
            autoresOrdenados.add(postagem.getAutor());
        }
        return autoresOrdenados;
    }

    // Retorna contagem de postagens por categoria, ordenado por nome da categoria
    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post postagem : postagens) {
            String categoria = postagem.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }
}
