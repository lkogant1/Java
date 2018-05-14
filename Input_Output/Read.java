//Read character input using BufferedReader and InputStreamReader classes
import java.io.*;
class Read
{
	public static void main(String args[]) throws IOException
	{
		char ch;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.print("ch:");
		ch=(char)br.read();
		System.out.println("character:"+ ch);

	}
}

