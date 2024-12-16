package Pizzas;
public abstract class Pizza {
    int tamanho;
    String sabor;
    
    public void cortar(){
        System.out.println("Flit Flit, cortando em 8 pedaços");
    }

    public abstract void preparar();

    public abstract void assar();
}