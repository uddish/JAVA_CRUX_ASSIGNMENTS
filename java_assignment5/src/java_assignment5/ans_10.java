package java_assignment5;

public class ans_10 {
	
	public static String star(String s)	{
		if(s.length() <= 1)	{
			return s;
		}
		String ans = star(s.substring(1));
		if(s.charAt(0) == s.charAt(1))
			return s.charAt(0) + "*" + ans;
		else
			return s.charAt(0) + ans;
		
	}

	public static void main(String[] args) {
		System.out.println(star("hello"));
	}

}
