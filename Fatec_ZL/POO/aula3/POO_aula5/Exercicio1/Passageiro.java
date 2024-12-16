package Exercicio1;

public class Passageiro extends Pessoa{

    public Passageiro(String nome){
        super(nome);
    }
   
    public void andar(){
        super.andar();
        System.out.println(" com pressa e atenção");
    }
}
