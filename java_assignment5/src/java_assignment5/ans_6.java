package java_assignment5;

public class ans_6 {

	public static String eliminateX(String s)	{
		if(s.length() <= 0)	{
			return s;
		}

		String ans = eliminateX(s.substring(1));

		if(s.charAt(0) == 'x')	{
			return ans;
		}

		else 
			return s.charAt(0) + ans;


	}

	public static void main(String[] args) {
		System.out.println(eliminateX("xxabxcxcx"));
	}

}
