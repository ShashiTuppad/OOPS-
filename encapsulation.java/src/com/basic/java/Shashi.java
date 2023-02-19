package com.basic.java;

public class Shashi {
	public static void main(String[] args) {
		int n=16;
		int b=0;
		for(int i=1;i<=n;i++) {
			if(n==i*i) {
				b++;
			}
		}
	if(b==1) {
		System.out.println("perfect sq");
	}
	else {
		System.out.println("not a pefect sq");
	}
	}
}
