package pattern_matching;

public class Temp {
	public static void main(String[] args) {
		
//		1
//		12
//		123
//		1234
//		12345
		
		
		int n=5;
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
