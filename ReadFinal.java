import java.lang.*;
import java.io.*;

class ReadFinal{
	public static void main(String args[]) throws IOException
	{
		int sno,m1,m2,m3,m4,tot;
		String sname;
		float avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("sno");
		sno=Integer.parseInt(br.readLine());
		System.out.println("sname");
		sname=(br.readLine());

		System.out.println("marks");
		m1 = Integer.parseInt(br.readLine());
		m2 = Integer.parseInt(br.readLine());
		m3 = Integer.parseInt(br.readLine());
		m4 = Integer.parseInt(br.readLine());
		tot = m1+m2+m3+m4;
		avg = tot/2;
		System.out.println("tot"+tot);
		System.out.println("avg"+avg);


	}
}