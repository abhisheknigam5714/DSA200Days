package Patterns;

public class Pattern1 {
	
	
	public static void pattern1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern5() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern7() {
		for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void pattern8() {
		for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*5)-(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void pattern9() {
		
		
		
			for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
			for(int i=1;i<=5;i++) {
				
				for(int k=1;k<=i-1;k++) {
					System.out.print(" ");
				}
				
				for(int j=1;j<=(2*5)-(2*i-1);j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
	}
	
	private static void pattern10() {
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				for(int j=1;j<=i;j++) {
			
				System.out.print("*");
			}
		}
			
			else if(i>5) {
			for(int k=1;k<=i-2*k;k++) {
				System.out.print("*");
			}
		}
		System.out.println();
		}
		
		
	}
	
	public static void pattern13() {
		char ch='A';
		for(int i=1;i<5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
	}
	
	
	public static void pattern12() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		for(int i1=1;i1<=4;i1++) {
			for(int j1=1;j1<=4-i1;j1++) {
				System.out.print(" ");
			}
			for(int k=i1;k>=1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		//pattern1();
		//pattern2();
		//pattern5();
		//pattern7();
		//pattern8();
		//pattern9();
		//pattern10();
		pattern13();
	}

	

}
