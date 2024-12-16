import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    private List<Autor> autores;

    public Biblioteca() {
    }

    public Biblioteca(String nome, List<Livro> livros, List<Autor> autores) {
        this.nome = nome;
        this.livros = livros;
        this.autores = autores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}

