package logic;

public class Xylem {
	public static void main(String[] args) {
	int n=933311;
	int outer_sum=n%10,inner_sum=0;
	n=n/10;
	while (n>10){
		inner_sum+=n%10;
		n/=10;
	}
	outer_sum+=n%10;
	if(outer_sum==inner_sum) {
		System.out.println("it is xylem");
	}
	}
}







