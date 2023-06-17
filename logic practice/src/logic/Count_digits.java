package logic;

public class Count_digits {
	public static void main(String[] args) {
		int n=12345;
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		System.out.println(count);
	}
}
