import java.util.Scanner;

public class ans_1 {

	public static boolean binarySearch(int a[],int s,int end, int mid,int item)	{
		mid = (s+end)/2;
		if(s > end)	{
			return false;
		}
		
		if(a[mid] == item)	{
			return true;
		}
		if(item > a[mid]){
			return binarySearch(a, mid+1, end, mid, item);
		}
		else
			return binarySearch(a, s, mid-1, mid, item);
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be searched");
		int item = s.nextInt();
		int mid = (a.length-1)/2;
		System.out.println(binarySearch(a, 0, a.length-1, mid, item));
				
		
	}

}
