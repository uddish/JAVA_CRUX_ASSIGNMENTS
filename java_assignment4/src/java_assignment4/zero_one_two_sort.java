package java_assignment4;

public class zero_one_two_sort {

	public static void sort(int a[])	{
		int i = 0,temp,back;
		int last = a.length-1;
		if(a[0] == 0)	{
			i++;
		}
		for(int j = i+1;j < a.length;j++)	{
			if(a[j] == 0)	{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		

		}
		for(int j = last-1;j >= 0;j--)	{
			if(a[j] == 2)	{
				temp = a[j];
				a[j] = a[last];
				a[last] = temp;
				last--;
			}
		}

		for(int k = 0;k < a.length;k++)
			System.out.print(a[k]);
	}

	public static void main(String[] args) {
		int a[] = {0,1,1,0,2,1,2,0,0,2,0,1,0,2,1};
		sort(a);
	}

}
