package pattern_matching;

public class Temp13 {
	public static void main(String[] args) {
		int n=5; 
		for(int i=n;i>=1;i--) {
			for(int s=1;s<=n-1;s++) {
				System.out.print("  ");
			}
			for(int a=1;a<=2*i-1;a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
