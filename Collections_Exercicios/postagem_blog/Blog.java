import java.util.*;

public class Blog {
    private Set<Post> postagens;

    public Blog() {
        postagens = new HashSet<>();
    }

    public void adicionarPostagem(Post postagem) {
        for (Post existente : postagens) {
            if (existente.getAutor().equals(postagem.getAutor()) &&
                existente.getTitulo().equals(postagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post p : postagens) {
            autores.add(p.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new HashMap<>();
        for (Post p : postagens) {
            Categorias cat = p.getCategoria();
            contagem.put(cat, contagem.getOrDefault(cat, 0) + 1);
        }

        // Ordena por valor decrescente
        List<Map.Entry<Categorias, Integer>> listaOrdenada = new ArrayList<>(contagem.entrySet());
        listaOrdenada.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

        Map<Categorias, Integer> resultadoOrdenado = new LinkedHashMap<>();
        for (Map.Entry<Categorias, Integer> entry : listaOrdenada) {
            resultadoOrdenado.put(entry.getKey(), entry.getValue());
        }

        return resultadoOrdenado;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> resultado = new TreeSet<>();
        for (Post p : postagens) {
            if (p.getAutor().equals(autor)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> resultado = new TreeSet<>();
        for (Post p : postagens) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        // Ordem manual das categorias
        Map<Categorias, Set<Post>> mapa = new LinkedHashMap<>();
        mapa.put(Categorias.DEVOPS, new TreeSet<>());
        mapa.put(Categorias.DESENVOLVIMENTO, new TreeSet<>());
        mapa.put(Categorias.DATA_SCIENCE, new TreeSet<>());

        for (Post p : postagens) {
            mapa.get(p.getCategoria()).add(p);
        }

        return mapa;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        // Coleta autores únicos
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Post p : postagens) {
            autoresUnicos.add(p.getAutor());
        }

        // Ordena autores por nome completo
        List<Autor> autoresOrdenados = new ArrayList<>(autoresUnicos);
        autoresOrdenados.sort(Comparator.comparing(Autor::toString));

        Map<Autor, Set<Post>> mapa = new LinkedHashMap<>();
        for (Autor autor : autoresOrdenados) {
            Set<Post> postsDoAutor = new TreeSet<>();
            for (Post p : postagens) {
                if (p.getAutor().equals(autor)) {
                    postsDoAutor.add(p);
                }
            }
            mapa.put(autor, postsDoAutor);
        }

        return mapa;
    }
}
