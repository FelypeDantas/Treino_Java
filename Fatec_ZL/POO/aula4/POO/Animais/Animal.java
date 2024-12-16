package Animais;

public abstract class Animal {
    
    public void respirar(){
        System.out.println("Respira");
    }

    public abstract void fazerSom();

    public String getDescricao(){
        return "Descrição";
    }

    public String getImage(){
        return "Imagem";
    }
}
