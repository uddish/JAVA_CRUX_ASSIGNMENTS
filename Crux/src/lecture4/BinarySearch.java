package lecture4;

import java.util.Scanner;

public class BinarySearch {

	public static void BinarySearch(int a[],int item)	{
		int start = 0, end = a.length-1;
		int flag = 0;
		while(start <= end)	{
			int mid = (start+end)/2;
			if(item == a[mid])	{
				System.out.println("found");
				flag = 1;
			}

			if(item > a[mid])	{
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		if(flag == 0)
			System.out.println("not found");
		
	}



	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to be found");
		int item = s.nextInt();
		BinarySearch(a,item);
	}


}
