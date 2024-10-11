package beecrownd;

import java.util.Scanner;

public class Media3 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        float N1 = sc.nextFloat();
	        float N2 = sc.nextFloat();
	        float N3 = sc.nextFloat();
	        float N4 = sc.nextFloat();

	        
	        float media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;

	      
	        System.out.printf("Media: %.1f\n", media);

	
	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado.");
	        } else if (media < 5.0) {
	            System.out.println("Aluno reprovado.");
	        } else {
	            System.out.println("Aluno em exame.");
	            
	            float examScore = sc.nextFloat();
	            System.out.printf("Nota do exame: %.1f\n", examScore);

	        
	            float finalAverage = (media + examScore) / 2;
	            if (finalAverage >= 5.0) {
	                System.out.println("Aluno aprovado.");
	            } else {
	                System.out.println("Aluno reprovado.");
	            }
	            // Output the final average with one decimal place
	            System.out.printf("Media final: %.1f\n", finalAverage);
	        }

	        sc.close();
	    }
	}