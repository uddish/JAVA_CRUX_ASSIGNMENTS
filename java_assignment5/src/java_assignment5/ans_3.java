package java_assignment5;

public class ans_3 {

	public static double geometricSum(double sum, int k)	{
		if(k == 0)	{
			return sum;
		}
		if(k > 0){
			return sum+=geometricSum(Math.pow(0.5, k),k-1);
			
		}
		return geometricSum(sum,k);
	}
	
	public static void main(String[] args) {
	
		System.out.println(geometricSum(1,4));
	}

}
