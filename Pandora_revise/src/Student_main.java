import java.util.Scanner;

public class Student_main extends Student{

	public static String[] addstudents()	{
		Scanner s = new Scanner(System.in);
		String add[] = new String[10];
		System.out.println("Enter the name of the Students : ");
		for(int i = 0;i < 10;i++)	{
			add[i] = s.nextLine();
		}
		return add;
	}

	public static void attendance(String[] a)	{
		Scanner s = new Scanner(System.in);
		String att[] = new String[10];
		for(int i = 0;i < 10;i++)	{
			System.out.println("Enter the attendance of " + a[i] + " : ");
			att[i] = s.nextLine();
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		getter();
		setter();
		String a[] = addstudents();
		attendance(a);
	}

}
