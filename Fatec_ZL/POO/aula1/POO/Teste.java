import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Empresa empresa = new Empresa();

        empresa.nomeDaEmpresa = "Sistemas da Informação SA";
        empresa.salarioMensalTotal = 120000.00;

        Disciplina disciplina = new Disciplina();

        notasAluno(disciplina.notas);
        nomesAlunos(disciplina.nomes);

        Carro car = new Carro();

        car.placa = "ABC1234";
        car.chassi = "1HGBH41JXMN109186";
        car.nome = "Prisma";
        car.modelo = "PF5";
        car.ano = 2009;
        car.cor = "Preto";

        Matematica mat = new Matematica();
        System.out.println(mat.numeroDeOuro);

        Armario arm = new Armario();
        arm.quantidadeTenis = 30;

    }

    public static void notasAluno(double[] notasdisciplina){
        Scanner sca = new Scanner(System.in);
         for(int contador = 0; contador < 3; contador++){
            System.out.println("Insira a nota: ");
             notasdisciplina[contador] = sca.nextDouble();
        }
        sca.close();
    }

    public static void nomesAlunos(String[] nomes){
        Scanner sca = new Scanner(System.in);
        for(int contador = 0; contador < 10; contador++){
           System.out.println("Insira o nome: ");
            nomes[contador] = sca.next();
       }
       sca.close();
    }
}
