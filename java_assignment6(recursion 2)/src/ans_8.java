
public class ans_8 {

	public static Boolean checkString(String s, int i)	{
		if(s.charAt(0) != 'a')	{
			return false;
		}
		if(i >= s.length())	{
			return true;
		}
		if(s.charAt(i) == 'a' || s.charAt(i) == ' ')	{
			return checkString(s, i+1);
		}
		if(s.charAt(i) == 'b' && s.charAt(i+1) == 'b')	{
			if(s.charAt(i+2) == 'a')	{
				return checkString(s, i+2);
			}

		}
		return false;
	}

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(checkString(s, 1));
	}

}
