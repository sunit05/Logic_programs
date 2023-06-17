package logic;

public class rev {
	public static void main(String[] args) {
	int i=12345;
	int rev=0;
	while(i!=0) {
		int temp=i%10;
		rev=rev*10+temp;
		i/=10;
	}
	System.out.println(rev);
}
}
