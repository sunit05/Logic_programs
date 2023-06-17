package pattern_matching;

import java.util.Scanner;

public class Temp8 {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.println("enter case");
		int a = b.nextInt();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int n = sc.nextInt();
		switch (a) {
		case 1:

				//		5 5 5 5 5 
				//		4 4 4 4 
				//		3 3 3 
				//		2 2 
				//		1 

			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;

		case 2:

				//		5 4 3 2 1 
				//		4 3 2 1 
				//		3 2 1 
				//		2 1 
				//		1 

			for (int i = n; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

		case 3:

				//		1 2 3 4 5 
				//		2 3 4 5 
				//		3 4 5 
				//		4 5 
				//		5 

			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= n; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

		case 4:
			
				//			5 4 3 2 1 
				//			5 4 3 2 
				//			5 4 3 
				//			5 4 
				//			5 
			
			for (int i = 1; i <= n; i++) {
				for (int j = n; j >= i; j--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}

		}
	}
}