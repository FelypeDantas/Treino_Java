public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
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

    @Override
    public String toString(){
        return String.format("Contato(nome = '%s', telefone = '%s', email = '%s')",
                    this.nome, this.telefone, this.email);
    }
}

