import java.util.Scanner;

public class Student {

	private static String firstname[] = new String[10];
	private static String lastname[] = new String[10];
	private static int rollno[] = new int[10];

	public static void getter()	{
		Scanner s = new Scanner(System.in);
		for(int i = 0;i < 10;i++)	{
			System.out.println("Enter the firstname of student " + i + " : ");
			firstname[i] = s.nextLine();
			System.out.println("Enter the lastname of student " + i + " : ");
			lastname[i] = s.nextLine();
			System.out.println("Enter the roll no of student " + i + " : ");
			rollno[i] = s.nextInt();
		}

	}

	public static void setter()	{
		for(int i = 0;i < 10;i++)	{
			//System.out.println("firstname            lastname                 rollno");
			System.out.println(firstname[i] + "  " + lastname[i] + " " + "    " + rollno[i]);
		}
	}

}


