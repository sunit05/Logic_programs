package logic;


public class perfect {
	//perfect number : sum of its proper divisors
	
	public static void main(String[] args) {
		int n=11,sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0) {
				sum+=i;
				
			}
		}
		if(sum==n) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("it is not a perfect number");
		}
	}
}	
