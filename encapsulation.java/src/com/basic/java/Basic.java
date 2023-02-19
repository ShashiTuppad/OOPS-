package com.basic.java;

import shashidhar.java.Mainclass;

public class Basic {
 static int x=100;
	 void test() {
		 System.out.println("static x value "+ x);
		 int x=200;
		 
	 }
	 public static void main(String args[]) {
		 System.out.println("main method started "+x);
		 test y=new test();
		 y.test();
		 System.out.println("x after test function call "+ x);
	 
 }
}
