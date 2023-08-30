package list.Pesquisa.catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public List<Livro> getLivroList() {
        return livroList;
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livroList.add(livro);
    }

    private List<Livro> pesquisarPorAutor(String autor){
        List<Livro> selecionados = new ArrayList<>();
        if (livroList.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }
        else {
            for (Livro livro : livroList){
                if (livro.getAutor().equalsIgnoreCase(autor));
                   selecionados.add(livro);
            }
        }
        return selecionados;
    }

}