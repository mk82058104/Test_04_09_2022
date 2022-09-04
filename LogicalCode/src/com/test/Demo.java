package com.test;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hi");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String str=sc.nextLine();
		if(str.equals("yes")) {
			System.out.println("I am good");
		}
		else {
			System.out.println("I am bad");
		}

	}

}
