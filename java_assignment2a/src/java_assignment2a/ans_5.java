package java_assignment2a;

public class ans_5 {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while(n <= 20)	{
			sum = 3*n + 2;
			n++;
			if(sum % 4 != 0)
				System.out.println(sum);
		}

	}

}
