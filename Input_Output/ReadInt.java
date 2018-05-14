import java.io.*;

class ReadInt
{
	public static void main(String args[]) throws IOException
	{
		int n;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.println("integer:");
		n = Integer.parseInt(br.readLine());
		System.out.println("integer "+n);

	}
}