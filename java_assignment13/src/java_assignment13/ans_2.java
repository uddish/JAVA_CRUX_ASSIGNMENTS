package java_assignment13;

import java.util.ArrayList;
import java.util.HashMap;

public class ans_2 {

	public static ArrayList<Integer> consecutiveNo(int[] a)	{

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < a.length;i++)	{
			if(!map.containsKey(a[i]))	{
				map.put(a[i], 1);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0;i < a.length;i++)	{
			int k = a[i] + i;
			if(map.containsKey(a[i]+1))	{
			ans.add(a[i]);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int a[] = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		ArrayList<Integer> b = consecutiveNo(a);
		for(int i = 0;i < b.size();i++)	{
			System.out.println(b.get(i));
		}
	}

}
