import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        double salario = sca.nextDouble();
        double percentual;

        if(salario >= 0 && salario <= 400.00){
            percentual = 0.15;
            calcular(salario, percentual);
        } else if(salario > 400.00 && salario <= 800.00){
            percentual = 0.12;
            calcular(salario, percentual);
        } else if(salario >= 800.01 && salario <= 1200.00){
            percentual = 0.10;
            calcular(salario, percentual);
        } else if(salario >= 1200.01 && salario <= 2000.00){
            percentual = 0.07;
            calcular(salario, percentual);
        } else if (salario > 2000.00) {
            percentual = 0.04;
            calcular(salario, percentual);
        } else {
            System.out.println("Salario invalido");
        }
        sca.close();
    }

    public static void calcular(double salario, double percentual){
        double reajusteFinal;
        double reajuste;

        reajuste = salario * percentual;
        reajusteFinal = salario + reajuste;
        recado(reajusteFinal, reajuste, percentual);
    }

    public static void recado(double reajusteFinal, double reajuste, double percentual){
        System.out.println(String.format("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%", 
        reajusteFinal, reajuste, (int) (percentual * 100)));
    
    }
}
