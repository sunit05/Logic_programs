package pattern_matching;


class Temp7 {
	
//	1 2 1 2 1 
//	1 2 1 2 1 
//	1 2 1 2 1 
//	1 2 1 2 1 
//	1 2 1 2 1 
	
	public static void main(String[] args) {
		int n=5,k=5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				
				System.out.print(k+" ");
				
			}
			k--;
			System.out.println();
		}
	}
}
