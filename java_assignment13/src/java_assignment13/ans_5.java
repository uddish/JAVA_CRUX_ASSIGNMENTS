package java_assignment13;

import java.util.HashMap;

public class ans_5 {

	public static void Difference(int a[], int k)	{

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < a.length;i++)	{
			map.put(a[i], 1);
		}
		for(int i = 0;i < a.length;i++)	{
			int value = a[i] + k;
			if(map.containsKey(value))	{
				System.out.println(a[i] + "," + value);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,4,7,8,3,5,6,9};
		Difference(a, 4);
	}

}
