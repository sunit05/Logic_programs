package logic;

public class Prime {
	public static void main(String[] args) {
		int n=20;
		for(int i=2;i<=n;i++) {
			if(i%2==0 || i%3==0) {
//				System.out.println();
			}
			else {
				System.out.println(i);
			}
		}
	}
}
