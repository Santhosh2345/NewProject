package com.maths;

public class PrimeNumber {
	public static void main(String[] args) {
		int a =50;
		int b;
	for (int i = 0; i < a; i++) {
		b=0;
		for (int j = 1; j <=i; j++) {     // 23%1 == 0     23%23==0   b= 2
			if(i%j==0) {              //24%1==0   24%2==0  24%4==6...24%24==0  b=2+
				b=b+1;
			}
		}
		if(b==2) {
			System.out.println(i);
		}
	}	
//another method		
	/*	String prime =" " ;
		for ( i=1 ; i <a; i++) {
			int b=0;
			for ( j = i; j >=1; j--) {
				if(i%j==0) {
					b=b+1;
				
				}
			}
		if(b==2){
			prime = prime+ i+" ";
		}
	}
System.out.println(prime);*/
}
}
