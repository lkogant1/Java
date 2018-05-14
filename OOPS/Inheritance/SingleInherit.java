/*
create a single sub class from a single super class
*/

//base class
class addition
{
	int a,b;
	//instance variables
	//a = 10;
	//b = 20;
	
	//create a constructor for initialization of variables
	addition()
	{
		a = 10;
		b = 20;
	}
	
	//method add()
	void add()
	{
		//a = 10; 
		//b = 12;
		int sum; //local variable
		sum = a+b;
		System.out.println("Sum of two integers: "+sum);
	}
}

//derived class
class Diff extends addition
{ 
	int d; //local variable

	//method sub() 
	void sub()
	{
		d = a-b;
		System.out.println("difference between two integers: "+d);
	}

}

class SingleInherit
{
	public static void main(String args[])
	{
		//create object to sub class
		Diff object1 = new Diff(); 
		object1.add(); //method of super class
		object1.sub(); //method of sub class
	}
}

/*

SingleInherit.java:6: error: <identifier> expected
	a = 10;
	 ^
SingleInherit.java:7: error: <identifier> expected
	b = 20;
	 ^
*/