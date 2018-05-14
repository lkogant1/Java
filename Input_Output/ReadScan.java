import java.util.*;
class ReadScan{
	public static void main(String args[])
	{
		int sno,m1,m2,m3,tot;
		String sname;
		double avg;

		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		sname = sc.next();
		System.out.println("enter snumber");
		sno = sc.nextInt();
		System.out.println("enter m1");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		tot = m1+m2+m3;
		avg = tot/3;
		System.out.println("total "+tot);
		System.out.println("avg "+avg);
		System.out.println("sname "+sname);
		System.out.println("sno "+sno);

	}
}