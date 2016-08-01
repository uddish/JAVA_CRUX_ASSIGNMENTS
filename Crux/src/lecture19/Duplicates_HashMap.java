package lecture19;

import java.util.HashMap;

public class Duplicates_HashMap {

	public static int[] duplicates(int[] a)	{

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < a.length;i++)	{
			if(map.containsKey(a[i]))	{
				a[i] = 0;
			}
			else	{
				map.put(a[i], 1);
			}
		}

		int size = map.size();							//to make a new array of shorter length
		int b[] = new int[size];						//array b of size hashmap
		int j = 0;
		for(int i = 0; i < a.length; i++)	{
			if(map.containsKey(a[i]))	{
				b[j] = a[i];
				map.remove(a[i]);
				j++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = {1,2,4,2,3,1,5,2,8,8};
		int b[] = duplicates(a);
		for(int i = 0; i < b.length;i++)	{							//value of a[i] gets saved in i by using this dope loop
			System.out.print(b[i] + " ");
		}
	}

}
