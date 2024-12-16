public class Curso {
    private int id;
    private String nome;
    private String codigo;
    private String coordenador;
    private int quantidadeAlunos;

    public Curso(int id, String nome, String codigo, String coordenador, int quantidadeAlunos) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.coordenador = coordenador;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getCoordenador() { return coordenador; }
    public void setCoordenador(String coordenador) { this.coordenador = coordenador; }
    public int getQuantidadeAlunos() { return quantidadeAlunos; }
    public void setQuantidadeAlunos(int quantidadeAlunos) { this.quantidadeAlunos = quantidadeAlunos; }
}

