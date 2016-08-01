
public class ans_6 {

	public static String paranthesis(String s,String s1, int i)	{
		if(s.charAt(i) == ')')	{
			return s1;
		}
		if(s.charAt(i) == '(')	{
			s1 = s1 + s.charAt(i);
			return paranthesis(s, s1, i+1);
		}
		else
		return paranthesis(s, s1, i+1);
	}
	
	public static void main(String[] args) {
		String s = "xyz(abc)123";
		System.out.println(paranthesis(s, "", 0));
		
	}

}
