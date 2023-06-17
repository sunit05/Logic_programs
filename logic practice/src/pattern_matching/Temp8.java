package pattern_matching;

import java.util.Scanner;

public class Temp8 {

public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
	System.ou1t.println("enter case");
	int a=b.nextInt();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int n=sc.nextInt();
	switch(a) {
	case 1:
			for(int i=n;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			break;
			
	case 2:
			for(int i=n;i>=1;i--) {
				for (int j=i; j>=1; j--) {
					System.out.print(j+" ");
				}
				System.out.println();
			}break;
	case 3:
		for(int i=1;i<=n;i++) {
			for(int j=i; j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	case 4:
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		
}}}