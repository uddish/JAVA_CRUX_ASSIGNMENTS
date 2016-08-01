package java_assignment13;

import java.util.Collections;
import java.util.HashMap;

public class ans_3 {
	
	public static void MostOccuring(int a[])	{
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < a.length;i++)	{
			if(!map.containsKey(a[i]))	{
				map.put(a[i], 1);
			}
			else	{
				int value = map.get(a[i]);
				map.put(a[i], value+1);
			}
		}
		Integer max = Collections.max(map.values());				//max value is saved in max
		for (HashMap.Entry<Integer, Integer> entry : map.entrySet())	{
			if (entry.getValue()==max) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,2,3,1,3,3,2,1,3,4,5,6};
		MostOccuring(a);
	}

}
