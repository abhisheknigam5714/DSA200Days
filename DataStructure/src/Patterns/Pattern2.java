package Patterns;

public class Pattern2 {
	
	
	public static void pattern1() {
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count++);
			}
			System.out.println( );
		}
		
	}
	
	public static void pattern2() {
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=5-i+1;j++) {
				System.out.print((char)(ch));
				ch=(char)(ch+1);
			}
			System.out.println( );
		}
		
	}
	
	
public static void pattern3() {
		
		for(int i=1;i<=5;i++) {
			char start='A';
			char ch=(char) (start+5-i);
			for(int j=1;j<=i;j++) {
				System.out.print((char)(ch+j-1));
				
			}
			System.out.println( );
		}
		
	}




public static void pattern5() {
	
	for(int i=1;i<=4;i++) {
		char ch='A';
		for(int sp=1;sp<=4-i;sp++) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=2*i-1;j++) {
			if(j>i) {
				
				System.out.print((char)(ch--));
				
			}
			else {
			System.out.print(ch);
			ch=(char)(ch+1);
			}
		}
		
		System.out.println();
		
		
	}
		
	
}
	
	public static void main(String[] args) {
	//	pattern1();
	//	pattern2();
	//
	//	pattern3();
		pattern5();
		
	}
}
