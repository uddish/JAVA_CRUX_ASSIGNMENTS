package lecture25;

public class EditDistance {

	public static int EditDistance_Recursion(String s, String t)	{

		if(s.length() == 0 || t.length() == 0)	{
			return Math.max(s.length(), t.length());
		}

		if(s.charAt(0) == t.charAt(0))	{
			return EditDistance_Recursion(s.substring(1), t.substring(1));		//function is returning some value
		}

		int insert = 1 + EditDistance_Recursion(s, t.substring(1));
		int delete = 1 + EditDistance_Recursion(s.substring(1), t);
		int substitute = 1 + EditDistance_Recursion(s.substring(1), t.substring(1));
		return Math.min(substitute, Math.min(delete, insert));
	}

	public static int EditDistance_RecursionDP(String s, String t)	{
		int a[][] = new int[s.length()+1][t.length()+1];
		for(int i = 0;i <= s.length();i++)	{				//i <= s.length because size of array is +1
			for(int j = 0;j <= t.length();j++)	{			//j <= t.length because size of array is +1
				a[i][j] = -1;
			}
		}
		return EditDistance_RecursionDP_Helper(s, t, a);
	}

	public static int EditDistance_RecursionDP_Helper(String s, String t, int[][] a) {

		int m = s.length();
		int n = t.length();
		if(m == 0 || n == 0)	{
			return Math.max(m, n);
		}

		if(a[m][n] != -1)	{
			return a[m][n];
		}
		if(s.charAt(0) == t.charAt(0))	{
			a[m][n] = EditDistance_RecursionDP_Helper(s.substring(1), t.substring(1), a);
		}
		else	{
			int insert = 1 + EditDistance_RecursionDP_Helper(s, t.substring(1), a);
			int delete = 1 + EditDistance_RecursionDP_Helper(s.substring(1), t, a);
			int substitute = 1 + EditDistance_RecursionDP_Helper(s.substring(1), t.substring(1), a);
			a[m][n] = Math.min(substitute, Math.min(delete, insert));
		}
		return a[m][n];
	}

	public static int EditDistance_Iterative(String s, String t)	{

		int m = s.length();
		int n = t.length();
		int a[][] = new int[m+1][n+1];
		for(int i = 0;i <= n;i++)	{
			a[0][i] = i;
		}
		for(int i = 0;i <= m;i++)	{
			a[i][0] = i;
		}

		for(int i = 1;i <= m;i++)	{			//it is started from 1 bec 0th row n column are already filled
			for(int j = 1;j <= n;j++)	{
				if(s.charAt(m-i) == t.charAt(n-j))	{
					a[i][j] = a[i-1][j-1];
				}
				else	{
					a[i][j] = Math.min(1+a[i][j-1], Math.min(1+a[i-1][j], 1+a[i-1][j-1]));
				}

			}
		}
		return a[m][n];
	}

	public static void main(String[] args) {

		String s = "abcxyz";
		String t = "bxyt";
		System.out.println(EditDistance_Recursion(s, t));
		System.out.println(EditDistance_RecursionDP(s,t));
		System.out.println(EditDistance_Iterative(s, t));
	}

}
