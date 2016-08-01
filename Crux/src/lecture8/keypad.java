package lecture8;

import java.io.StreamCorruptedException;

public class keypad {

	public static String[] helper(int n)	{
		String empty[] = {""};
		if(n == 2)	{
			String ans[] = {"a","b","c"};
			return ans;
		}
		else if(n == 3)	{
			String ans[] = {"d","e","f"};
			return ans;
		}
		else if(n == 4)	{
			String ans[] = {"g","h","i"};
			return ans;
		}
		else if(n == 5)	{
			String ans[] = {"j","k","l"};
			return ans;
		}
		else if(n == 6)	{
			String ans[] = {"m","n","o"};
			return ans;
		}
		else if(n == 7)	{
			String ans[] = {"p","q","r","s"};
			return ans;
		}
		else if(n == 8)	{
			String ans[] = {"t","u","v","w"};
			return ans;
		}
		else if(n == 9)	{
			String ans[] = {"x","y","z"};
			return ans;
		}
		return empty;
	}

	public static String[] keypad(int n)	{
		if(n/10 == 0)	{
			String s1[] = helper(n);
			return s1;
		}
		String s1[] = keypad(n/10);					//reduce number

		String s2[] = helper(n%10);					//pass last number

		String s3[] = new String[s1.length * s2.length];

		int i = 0,k = 0,j = 0;

		for(i = 0; i < s1.length;i++)	{
			for(k = 0;k < s2.length;k++)	{
				s3[j] = s1[i] + s2[k];
				j++;

			}
		}
		return s3;

	}

	
	public static void keypad_2(int n,String output)	{
		
		if(n == 0){
			System.out.println(output);
			return;
		}
		String s[] = helper(n%10);
		for(int i = 0;i < s.length;i++)	{
			keypad_2(n/10, output + s[i]);
			
		}

		
	}

	public static void main(String[] args) {
//		String s4[] = keypad(234);
//		for(int i = 0;i < s4.length;i++)
//			System.out.println(s4[i]);
		keypad_2(234,"");

	}

}
