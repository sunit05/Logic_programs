package pattern_matching;

public class Temp12 {
	
//        A 
//      A B 
//    A B C 
//  A B C D 
//A B C D E 
	
	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print((char)(64+j)+" ");
		}
		System.out.println();
	}
	}
}
