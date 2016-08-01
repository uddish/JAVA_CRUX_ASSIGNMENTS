package java_assignment5;

public class ans_5 {
	
	public static String replacePi(String s)	{
		if(s.length() <= 1) {
			return s;
		}
		String ans = replacePi(s.substring(1));
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			return "3.14" + ans.substring(1);
		}
		else {
			return s.charAt(0) + ans;
		}
	}

	public static void main(String[] args) {
		System.out.println(replacePi("xpipix"));
		
	}

}
