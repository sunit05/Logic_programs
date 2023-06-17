package pattern_matching;

import java.util.Scanner;

public class Temp10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int n=sc.nextInt();
	int sp=0,st=n*2-1;
	for(int i=1;i<=n;i++) {
		for(int j=st;j>=1;j--) {
			System.out.print("*  ");
		}
		for(int j=0;j<=n-1;j++) {
			System.out.print("  ");
		}
		System.out.println();
		st-=2;
	}

}
}
