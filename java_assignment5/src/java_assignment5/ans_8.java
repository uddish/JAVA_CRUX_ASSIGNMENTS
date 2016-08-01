package java_assignment5;

public class ans_8 {
	
	public static int sumOfDigits(int n,int sum)	{
		if(n == 0)	{
			return sum;
		}
		if(n > 0)	{
		sum += n%10;
		return sumOfDigits(n/10, sum);
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345, 0));
	}

}
