package Pizzas;
public class PizzaMussarela extends Pizza{

    public PizzaMussarela(){
        this.sabor = "Mussarela";
    }

    @Override
    public void preparar() {
        System.out.println("Adicionando Mussarela");
    }

    @Override
    public void assar() {
       System.out.println("Assando...");
    }    
}
