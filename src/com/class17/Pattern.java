package com.class17;

public class Pattern {

	public static void main(String[] args) {
		
		Pattern p=new Pattern();
			
			p.starRectangle();
		
			p.numBlock();
		
			p.patterns2();
		
			p.patterns();
		
		

	}
	void starRectangle() {
		for(int a=0; a<4; a++) {
			for( int b=0; b<5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void numBlock() {
		for (int c=1; c<=4; c++) {
			for (int d=5; d>0; d--) {
				System.out.print(d);
				}
			System.out.println();
			}
		
		for (int e=5; e>0; e--) {
			for(int f=1; f<=5; f++) {
				System.out.print(e);
			}
			System.out.println();
		}
		
		
	

	}
	void patterns() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=6; j++) {
				if(i==1 || i==4 || j==1 || j==6) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	void patterns2() {
		for(int g=0; g<4; g++) {
			for(int h=0; h<=g; h++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
}
