package pattern_matching;

public class Star {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
//			System.out.println("*");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
