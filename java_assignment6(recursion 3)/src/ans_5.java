
public class ans_5 {

	public static String duplicates(String s)	{
		if(s.length() <= 1)	{
			return s;
		}
		String ans = duplicates(s.substring(1));
		if(s.charAt(1) == s.charAt(0))	{
			return ans;
		}
		else
			return s.charAt(0) + ans;
	}
	
	public static void main(String[] args) {
		String s = "aaabbcddd";
		System.out.println(duplicates(s));
	}

}
