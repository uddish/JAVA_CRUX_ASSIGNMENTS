package java_assignment13;

import java.util.HashMap;

public class Duplicates {
	
	public static String duplicates(String s)	{

		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i < s.length();i++)	{
			if(map.containsKey(s.charAt(i)))	{
//				a[i] = 0;
			}
			else	{
				map.put(s.charAt(i), 1);
			}
		}

//		int size = map.size();							//to make a new array of shorter length
//		int b[] = new int[size];						//array b of size hashmap
		String s1 = "";
		int j = 0;
		for(int i = 0; i < s.length(); i++)	{
			if(map.containsKey(s.charAt(i)))	{
				s1 = s1 + s.charAt(i);
				map.remove(s.charAt(i));
				j++;
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		String s = "aabcddaccb";
		System.out.println(duplicates(s));
	}

}
