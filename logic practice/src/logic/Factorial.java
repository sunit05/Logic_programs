package logic;

public class Factorial {
	public static void main(String[] args) {
		int n=5,temp=1;
		for(int i=1;i<=n;i++) {
			temp=temp*i;
		}
		System.out.println(temp);
	}

}
