
public class ans_4 {
	
	public static String[] permutation(String s)	{
		if(s.length() == 0)	{
			String out[] = new String[1];
			out[0] = "";
			return out;
		}
		String ans[] = permutation(s.substring(1));
		String output[] = new String[2*ans.length];
		int j = 0;
		for(int i = 0;i < ans.length;i++)	{
			output[j] = ans[i];
			j++;
		}
		for(int i = 0;i < ans.length;i++){
			output[j] = s.charAt(0) + ans[i];
			j++;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		String s = "abc";
		String ans[] = permutation(s);
		for(int i = 0;i < ans.length;i++)	{
			System.out.println(ans[i]);
		}
			
		
	}

}
