//Read String input using InputStreamReader and BufferedReader classes
import java.io.*;
class ReadLine
{
	public static void main(String args[]) throws IOException
	{
		String str;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.print("String:");
		str=br.readLine();
		System.out.println("String:"+ str); 

	}
}