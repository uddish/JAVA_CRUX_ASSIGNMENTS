package lecture6;

public class array_recursion {

	public static boolean checkSeven(int a[], int index)	{
		if(index > a.length-1)				//to check if index is greater than size
			return false;					//false will send control to main
		if(a[index] == 7)	{
			return true;
		}
		return checkSeven(a, index+1);
	}

	public static int checkIndex(int a[], int index)	// second function to give index of 7
	{
		if(index > a.length-1)				
			return -1;					
		if(a[index] == 7)	{
			return index;
		}
		return checkIndex(a, index+1);
	}
	
	public static int lastSevenIndex(int a[], int index,int g)	{
		if(index > a.length-1)
			return g;
		
		if(a[index] == 7)	{
			g = index;
		}
		return lastSevenIndex(a, index+1, g);
	}
	
//	public static int[] allSevenIndices(int a[], int index)	{
//
//		if(index == a.length)
//			
//			
//		
//	}
	



	public static void main(String[] args) {
		int a[] = {1,5,2,7,8,7,6};
		System.out.println(checkSeven(a,0));
//		System.out.println(checkIndex(a,0));
//		System.out.println(lastSevenIndex(a,0,-1));
	}

}
