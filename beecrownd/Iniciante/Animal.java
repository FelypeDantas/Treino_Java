import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra3 = scanner.nextLine();

        String animal;
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    animal = "aguia";
                } else {
                    animal = "pomba";
                }
            } else { 
                if (palavra3.equals("onivoro")) {
                    animal = "homem";
                } else { 
                    animal = "vaca";
                }
            }
        } else {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    animal = "pulga";
                } else { 
                    animal = "lagarta";
                }
            } else { 
                if (palavra3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else { 
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);

        scanner.close();
    }
}
