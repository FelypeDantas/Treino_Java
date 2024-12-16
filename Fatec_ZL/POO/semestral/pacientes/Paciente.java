package pacientes;
import java.time.LocalDate;

public class Paciente {
    private String nome = "";
    private LocalDate cadastro = LocalDate.now();
    private String sexo = "";
    private String endereco = "";
    private String telefone = "";
    private String email = "";
    private String cartaoSus = "";
    private int id = 0;

    public Paciente(String nome, String sexo, String endereco, String telefone, String email, String cartaoSus) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cartaoSus = cartaoSus;
        this.cadastro = LocalDate.now(); 
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getCadastro(){
        return this.cadastro;
    }

    public void setCadastro(LocalDate cadastro){
        this.cadastro = cadastro;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCartaoSus(){
        return this.cartaoSus;
    }

    public void setCartaoSus(String cartaoSus){
        this.cartaoSus = cartaoSus;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
}
