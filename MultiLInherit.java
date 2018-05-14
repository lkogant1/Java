/*
Multilevel inheritance
extension of class repeatedly 
base2 class extends base1 class
sub1 class extends base2 class
sub2 class extends sub1 class
*/

import java.util.*;
import java.lang.*;

class base1
{
	int sno;
	String sname;

	void input1()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("sno: ");
		sno = scan1.nextInt();
		System.out.println("sname: ");
		sname = scan1.next();
	}

}

class base2 extends base1
{
	double java;
	double c;
	double python;
	void input2()
	{
		Scanner scan2 = new Scanner(System.in);
		System.out.println("java: ");
		java = scan2.nextDouble();
		System.out.println("c: ");
		c = scan2.nextDouble();
		System.out.println("python: ");
		python = scan2.nextDouble();
	}
}

class sub1 extends base2
{
	void display()
	{
		System.out.println("sno: "+sno);
		System.out.println("sname: "+sname);
		System.out.println("Java: "+java);
		System.out.println("C: "+c);
		System.out.println("Python: "+python);
	}
}

class sub2 extends sub1
{
	double tot,avg;
	void grade()
	{
		tot = python+c+java;
		avg = tot/3;
		if(python>=60 && c>=60 && java>=60)
		{
			System.out.println("Pass");
			if(avg>=90)
				System.out.println("Grade: A");
			else if(avg>=80)
				System.out.println("Grade: B");
			else if(avg>=70)
				System.out.println("Grade: C");
			else if(avg>=60)
				System.out.println("Grade: D");

		}
		else
		{
			System.out.println("Fail");
		}
	}
}

class MultiLInherit	
{
	public static void main(String args[])
	{
		//create object for last class
		sub2 object1 = new sub2();
		object1.input1();
		object1.input2();
		System.out.println("--------------------------------------------------");
		object1.display();
		System.out.println("--------------------------------------------------");
		object1.grade();
		System.out.println("--------------------------------------------------");
	}
}