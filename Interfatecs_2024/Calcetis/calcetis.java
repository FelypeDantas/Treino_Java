package maratona;

import java.util.*;

public class calcetis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();
        int N = scanner.nextInt();

        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt();
        }

        boolean found = canGetFreeShipping(V, prices);

        if (found) {
            System.out.println("fretegratis");
        } else {
            System.out.println("fretepago");
        }

        scanner.close();
    }

    private static boolean canGetFreeShipping(int V, int[] prices) {
        Arrays.sort(prices);

        int n = prices.length;

        for (int i = 0; i < n - 2; i++) {
            int target = 200 - V - prices[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = prices[left] + prices[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}
