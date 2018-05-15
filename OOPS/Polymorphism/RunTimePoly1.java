class Overriding1
{
	int n = 10;
	void disp()
	{
		System.out.println("the value of n is "+n);
	}
}

class Overriding2 extends Overriding1
{
	int m = 200;
	void disp()
	{
		System.out.println("the value of m is "+m);
	}
}

class RunTimePoly1
{
	public static void main(String args[])
	{	
		//create object and reference it
		Overriding1 superclass_object = new Overriding1();
		Overriding2 subclass_object = new Overriding2();
		
		//reference object to super class
		Overriding1 a;
		a = superclass_object; //assign superclass object to reference object of superclass
		a.disp();

		a = subclass_object; //assign subclass object to refernce object of subclass
		a.disp();

	}
}