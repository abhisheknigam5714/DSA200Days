package Mathematicals;

public class CountDigits {
	
	public static int counTotal(int n) {
		
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(counTotal(310000000));
	}

}
