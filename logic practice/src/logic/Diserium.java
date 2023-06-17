package logic;

public class Diserium {
	public static void main(String[] args) {
		int n=123;
		int i=1,pow=0,temp=0,rev=0,sum=0;
		while(n>0) {
			temp=n%10;
			rev=temp+rev*10;
			n/=10;
		}
		while(rev>0) {
			pow++;
			for(i=1;i<=pow;i++) {
				sum=rev*pow;
			}
		}
//		System.out.println(count);		
	}
}
