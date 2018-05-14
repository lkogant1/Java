import java.lang.*;
import java.util.*;
//define class
class Person
{
//define variables: these are instance variables
	int age;
	double salary;
	
//define method
void disp()
{
	System.out.println("age: "+age+"\n"+"salary: "+salary);
}
}

//create object inside main method
//save file with class_name of main method
class Person_Class
{
	public static void main(String args[])
	{
	//create object
	Person john = new Person();
	Person bill = new Person();

	//take input during runtime
	Scanner scan = new Scanner(System.in);
	System.out.println("John's age: ");
	john.age = scan.nextInt();
	System.out.println("John's salary: ");
	john.salary = scan.nextDouble();
	
	//john.age = 24;
	//john.salary = 72000.23;
	System.out.println("Bill's age: ");
	bill.age = scan.nextInt();
	System.out.println("Bill's salary: ");
	bill.salary = scan.nextDouble();

	//bill.age = 21;
	//bill.salary=35000.41;

	//calling method
	john.disp();
	bill.disp();
}
}
