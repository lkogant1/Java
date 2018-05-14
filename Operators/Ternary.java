//Ternary operator
//find max and min values
import java.lang.*;

class Ternary{
	public static void main(String args[]){
		int a =10,b=11;
		int min, max;
		max = (a>b)?a:b;
		min = (a<b)?a:b;
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
	}

}