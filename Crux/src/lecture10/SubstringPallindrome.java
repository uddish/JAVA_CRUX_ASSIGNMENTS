package lecture10;

public class SubstringPallindrome {

	public static void pallindromeString(String s)	{
		int mid = 0,count = 0;

		for(mid = 0;mid < s.length();mid++)	{
			int i = mid-1;
			int j = mid+1;
			System.out.println(s.charAt(mid));
			count++;
			while(i >= 0 && j < s.length())	{
				if(s.charAt(i) == s.charAt(j))	{
					System.out.println(s.substring(i,j+1));
					count++;

					i--;j++;
				}

				else	{
					break;
				}
			}


			if(s.charAt(mid) == s.charAt(mid+1))	{
				count++;
				i = mid-1;
				j = mid+2;
				System.out.println(s.substring(mid,mid+2));
				count++;
				while(i >= 0 && j < s.length())	{
					if(s.charAt(i) == s.charAt(j))	{
						System.out.println(s.substring(i,j+1));
						count++;
						i--;
						j++;
					}
					else
						break;
				}

			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {

		String s = "aabcba";
		pallindromeString(s);
	}

}
