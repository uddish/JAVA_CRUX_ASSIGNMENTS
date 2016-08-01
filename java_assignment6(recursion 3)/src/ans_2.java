
public class ans_2 {
	
	public static int gcd(int a,int b)	{
		if(a % b == 0)	{
			return b;
		}
		int c = a % b;
		return gcd(b,c);
	}

	public static void main(String[] args) {
		System.out.println(gcd(48,18));
	}

}
