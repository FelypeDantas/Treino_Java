import java.util.Scanner;

public class Logica {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        double imposto = 0;

        double salarioBruto = sca.nextDouble();
        double beneficio = sca.nextDouble();
        
        if(salarioBruto >= 0 && salarioBruto <= 1100){
            imposto = 0.05 * salarioBruto;
        } else if(salarioBruto >= 1100.01 && salarioBruto <= 2500){
            imposto = 0.1 * salarioBruto;
        } else if(salarioBruto >= 2500.01){
            imposto = 0.15 * salarioBruto;
        } else {
            System.out.println("O salario nao pode ser negativo!");
        }

        double saida = (salarioBruto - imposto) + beneficio;
        System.out.println(String.format("%.2f", saida));
        sca.close();
    }
}