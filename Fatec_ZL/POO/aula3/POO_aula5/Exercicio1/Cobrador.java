package Exercicio1;

public class Cobrador<T> {
    
    public void cobrarDinheiro(T objeto){
        System.out.printf("Estamos cobrando dinheiro da: %s%n",  objeto.getClass().getName());
    }
}
