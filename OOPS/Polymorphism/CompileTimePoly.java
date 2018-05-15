//Method overloading
//Runtime polymorphism
class Areas
{
	void area()
	{
		System.out.println("Method overloading");
	}

	int area(int i)
	{
		return (i*i);
	}

	int area(int a, int b)
	{
		return (a*b);
	}

	double area(double r)
	{
		return(3.14*r*r);
	}
}

class CompileTimePoly
{
	public static void main(String args[])
	{
	Areas object1 = new Areas();
	object1.area(); 
	System.out.println("area of square is "+object1.area(5));
	System.out.println("area of rectangle is "+object1.area(2,3));
	System.out.println("area of circle is "+object1.area(2.3));
	}

}