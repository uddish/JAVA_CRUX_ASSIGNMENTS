package java_assignment4;

public class zeroAndOneSort {

	public static void sort(int a[])	{
		int i = 0,temp;
		if(a[0] == 0)	{
			i++;
		}
			for(int j = i+1;j < a.length;j++)	{
				if(a[j] == 0){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					i++;

				}

			}
		for(int k = 0;k < a.length;k++)
			System.out.print(a[k]);
	}

	public static void main(String[] args) {
		int a[] = {0,1,1,0,0,0,1,0,1};
		sort(a);
	}

}
