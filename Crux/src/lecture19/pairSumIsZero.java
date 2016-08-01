package lecture19;

import java.util.HashMap;

public class pairSumIsZero {

	public static void Pairs(int a[])	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < a.length; i++)	{
			if(map.containsKey(-a[i]))	{
				System.out.println(a[i] + " " + -a[i]);
			}
			else	{
				map.put(a[i], 1);
			}

		}
	}

	public static void main(String[] args) {
		int a[] = {2,-2,2,-2};
		Pairs(a);
	}

}
