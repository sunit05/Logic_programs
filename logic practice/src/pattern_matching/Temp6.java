package pattern_matching;

public class Temp6 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(j%2==0) {
				System.out.print("2");
			}
			else if(j%2!=0) {
				System.out.print("1");
			}
			}
			System.out.println();
			}
		}
}