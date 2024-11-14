import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next(); 
        int diaInicio = sc.nextInt();
        int horaInicio = sc.nextInt();
        sc.next(); 
        int minutoInicio = sc.nextInt();
        sc.next(); 
        int segundoInicio = sc.nextInt();

        sc.next(); 
        int diaFim = sc.nextInt();
        int horaFim = sc.nextInt();
        sc.next(); 
        int minutoFim = sc.nextInt();
        sc.next(); 
        int segundoFim = sc.nextInt();

        int inicioEmSegundos = diaInicio * 86400 + horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
        int fimEmSegundos = diaFim * 86400 + horaFim * 3600 + minutoFim * 60 + segundoFim;
        int duracaoTotalSegundos = fimEmSegundos - inicioEmSegundos;

        int dias = duracaoTotalSegundos / 86400;
        duracaoTotalSegundos %= 86400;
        int horas = duracaoTotalSegundos / 3600;
        duracaoTotalSegundos %= 3600;
        int minutos = duracaoTotalSegundos / 60;
        int segundos = duracaoTotalSegundos % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}
