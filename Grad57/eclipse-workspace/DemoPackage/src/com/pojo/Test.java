package com.pojo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.Display();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name");
		String name= s.nextLine();
		System.out.println("Enter your Roll No.");
		int r=s.nextInt();
		System.out.println("Enter your marks");
		int [] mark=new int[3];
	
		for(int i=0;i<mark.length; i++)
		{
			mark[i]=s.nextInt();
		}
		Student s2=new Student(r,name,mark);
		s2.Display();
	}

}
