package com.maths;

import java.util.Iterator;

public class Pattern2 {
	public static void main(String[] args) {
/*		String a = "*";
		for (int i = 0; i <8; i++) {
			for (int j = i; j ==i; j++) {
				System.out.println(a);
				a = a+"*";
			}
		}*/
		
for (int i = 0; i < 4; i++) {
	for (int j = 4-i; j>1; j--) {
		System.out.print(" ");
	} 
	for (int j = 0; j<=i; j++) {
		System.out.print("* ");
		
	}
	System.out.println();
}		
		/*for (int i = 0; i < 5; i++) {
		for (int j = i; j < 5; j++) {
			System.out.print("*");
		}
		System.out.println();
		}*/
		/*for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for (int i = 0; i < 5; i++) {
			for (int j = 5-i; j >1; j--) {
				System.out.print(" ");
			}for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		/*for (int i = 0; i < 5; i++) {
			for (int j = 5-i; j >1 ; j--) {
				System.out.print(" ");
				
			}
			for (int j = 0; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}*/
		/*for (int i = 0; i <=8; i++) {
			 int t = i>(8/2)?8-i:i;
			 for (int j = 0; j <=t; j++) {
				System.out.print("* ");
			}
			 System.out.println();
	}*/
		for (int j = 0; j <= 6; j++) {
			int g = j>(6/2)?6-j:j;
            int f = (6/2)-g;
			for (int j2 = 0; j2 <f; j2++) {
				System.out.print(" ");
			}
			for (int s = 0; s <=g; s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
}

}

















































