
public class ans_1 {
	
	public static int smallest(int a[], int small, int i)	{
		if(a.length == 1)	{
			return a[0];
			}
		if(i >= a.length){
			return small;
		}
		if(a[i] < small)	{
			small = a[i];
			return smallest(a, small, i+1);
		}
		else
		return smallest(a, small, i+1);
	}

	public static void main(String[] args) {
		int a[] = {12,6,5,7,2,9,3,4,8};
		System.out.println(smallest(a,1000, 0));
		
	}

}
