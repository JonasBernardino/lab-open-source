package list.Pesquisa.catalogo;

public class Livro {

    private String título;
    private String autor;
    private Integer anoPublicacao;

    public Livro(String título, String autor, Integer anoPublicacao) {
        this.título = título;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro() {
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
