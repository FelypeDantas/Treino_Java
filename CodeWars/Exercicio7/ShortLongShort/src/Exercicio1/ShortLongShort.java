package Exercicio1;

import java.util.Scanner;

public class ShortLongShort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next(); 
        String B = scanner.next();

        String shortStr;
        String longStr;

        if (A.length() < B.length()) {
            shortStr = A;
            longStr = B;
        } else {
            shortStr = B;
            longStr = A;
        }

        String result = shortStr + longStr + shortStr;

        System.out.println("(" + '"'+ shortStr + '"' + ", " + '"' + longStr + '"' + ") --> " + '"'+result +'"');
        System.out.println("(" + '"'+ longStr + '"' + ", " + '"' + shortStr + '"' + ") --> " + '"'+result +'"');

        scanner.close();
    }

}
