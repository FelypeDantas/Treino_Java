import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("George R.R. Martin");

        Livro livro1 = new Livro("Harry Potter", autor1);
        Livro livro2 = new Livro("Game of Thrones", autor2);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);

        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", livros, autores);

        System.out.println("Nome da Biblioteca: " + biblioteca.getNome());
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println("Livro: " + livro.getTitulo() + ", Autor: " + livro.getAutor().getNome());
        }
        for (Autor autor : biblioteca.getAutores()) {
            System.out.println("Autor: " + autor.getNome());
        }
    }
}

