package pattern_matching;

public class Temp5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=n;j>=1;j--){
				if(i>=j){
					System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}}