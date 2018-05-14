/*
hierarchichal inheritance: create multiple sub classes from a single super class

base class: code for input taken at running time (n)
sub class derive1: find factorial for integer n
sub class derive2: find sum of n natural numbers
*/
import java.util.*;
import java.lang.*;

class base
{
	Scanner scan = new Scanner(System.in);
	int n;
	void read1()
	{
		System.out.print("enter an integer: ");
		n = scan.nextInt();
	}
}

class derive1 extends base
{	
	
	void fact()
	{
		int i,f=1;
		for (i=1;i<=n;i++)
		{
			f = f*i;
			i++;
		}
		System.out.println("factorial of "+n+": "+f);
	}
}

class derive2 extends base
{
	
	void sum()
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum = sum+i;
			i++;
		}
		System.out.println("sum of "+n+" natural numbers: "+sum);
	}
}

class HierarInherit
{
	public static void main(String args[])
	{
		//create object for derive1 class
		derive1 obj1 = new derive1(); 
		//create object for derive2 class
		derive2 obj2 = new derive2();
		//read input for object1 and call method on object1
		obj1.read1();
		obj1.fact();

		//read input for object2 and call method on object2
		obj2.read1();
		obj2.sum();

	}
}