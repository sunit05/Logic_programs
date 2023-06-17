package logic;

//import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		int o=6;
		switch (o) {
		case 1:{
		int a=10,b=20;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("a: "+a);
			System.out.println("b: "+b);	
		}
		case 2:{
			int base=2,pow=4,pro=1;
		
			System.out.println(pro);
		}
		case 3:{
		//xylem
			int n=6431;
			int outer=n%10,inner=0;
			n=n/10;
			while(n>=10) {
				inner+=n%10;
				n=n/10;
			}
			outer+=n;
			if(outer==inner) {System.out.println("it is xylem");}
			else {System.out.println("it is not xylem");}
		}
		case 4:{
			
			//prime
			int n=8;
			int i;
			for(i=2;i<n;i++) {
				if(n%i==0) {break;}
				
			}
			if(i==n){
				System.out.println("it is prime");
			}
			else {
				System.out.println("it is not prime");
			}
				
		}
		case 5:{
			int n=10;
			int i,sum=0;
			for(i=1;i<=n;i++) {
				if(i%2==0) {
				sum=sum+i;
				}
				
			}
			System.out.println(sum);
		}
		case 6:{
			//fact
			int n=8;
			int i,temp=1;
			for(i=1;i<=n;i++) {
				temp=i*temp;
			}
			System.out.println(temp);
		}
	}
}
}
	

