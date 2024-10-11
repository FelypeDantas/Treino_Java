package foundats;

import java.util.Scanner;

public class ArrayDobrado {

	public static void main(String[] args) {
		int arr[] = new int[3];

		Scanner sca = new Scanner(System.in);
		
		for(int i = 0 ; i < 3; i++) {
			arr[i] = sca.nextInt();
			arr[i] = arr[i] * 2 ;
		}
		
		System.out.print("[");
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.print("]");
		sca.close();
	}

}
