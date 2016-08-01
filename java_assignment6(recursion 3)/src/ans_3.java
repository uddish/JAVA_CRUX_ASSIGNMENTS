
public class ans_3 {

	public static String reverse(String s, int i,String s1)	{
		if(i < 0)	{
			return s1;
		}
		s1 = s1 + s.charAt(i);
		return reverse(s, i-1,s1);
	}

	public static void main(String[] args) {
		
		String s = "abcd";
		System.out.println(reverse(s,s.length()-1,""));
	}

}
