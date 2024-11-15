import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();  
            
            if (X == 0) {
                System.out.println("NULL");
            } else {
                String parity = (X % 2 == 0) ? "EVEN" : "ODD";
                String sign = (X > 0) ? "POSITIVE" : "NEGATIVE";
                System.out.println(parity + " " + sign);
            }
        }
        
        scanner.close(); 
    }
}
