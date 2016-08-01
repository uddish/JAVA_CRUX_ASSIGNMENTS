package java_assignment4;

import java.util.Scanner;

public class ans_5 {
	
	public static String[] takeInput()	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		String array[] = new String[size];
		for(int i = 0;i < size;i++)	{
			array[i] = s.next();
//			String s1 = s.nextLine();
		}
		return array;
	}
	
	public static void sort(String a[]){
		String s2;
		String temp;
		for(int i = 0;i < a.length;i++) {
//			if(a.length(i) <5 a.length(i+1)	{
				System.out.print(a[i] + " ");
			
//				System.out.print(a[i].length());
			}
		for(int i = 0;i < a.length-1;i++){
			if(a[i].length() > a[i+1].length())	{
				temp = a[i]	;
				a[i] = a[i+1];
				a[i+1] = temp;
				}
			}
		System.out.println();
		for(int i = 0;i < a.length;i++)
			System.out.print(a[i] + " ");
		}
//	}

	public static void main(String[] args) {
		String s1[] = takeInput();
		sort(s1);
	}

}
