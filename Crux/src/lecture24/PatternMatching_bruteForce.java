package lecture24;

public class PatternMatching_bruteForce {			//METHOD - 1 (BRUTE FORCE)----> Complexity = O(mn)

	public static Boolean PatternMatch(String s, String t)	{
		int j = 0;
		for(int i = 0;i <= s.length()-t.length() ;i++)	{
			for(int k = 0;k < t.length();k++)	{
				if(s.charAt(i+k) != t.charAt(k))	{
					break;
				}
				else	{
					if(k == t.length()-1)	{
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "abdceghaabghem";
		String t = "abgh";
		System.out.println(PatternMatch(s, t));
	}

}
