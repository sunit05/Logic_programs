package logic;

import java.util.Scanner;

public class Armstrong {
	public static boolean isArmstrong(int n) {
		int temp=n;
		int z=n;
		int count=0;int sum=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		//actual operation
		while(z>0) {
			int last_digit=z%10;
			int pro=1;
			//to find the power
			for(int i=1;i<=count;i++) {
				pro=pro*last_digit;	
			}
			sum=sum+pro;
			z=z/10;
		}
		if(n==sum) {
			return true;
			}
		else {
			return false;
		}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
			boolean res=isArmstrong(n);
			System.out.println(res);
	}
}
