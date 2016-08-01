package java_assignment5;

public class ans_2 {
	public static int product(int n,int count)	{			//answer 2
		if(n == 0)	{
			return count;
		}
		if(n%10 == 0){
			return product(n/10,count+=1);
		}
		return product(n/10,count);
	}
		public static void main(String[] args) {
		System.out.println(product(103050,0));
	}

}
