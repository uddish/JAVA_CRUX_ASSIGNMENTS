package java_assignment9;

public class ans_6 {

	public static void span(int price[], int output[]) throws stackFullException, stackEmptyException	{

		stack_array obj = new stack_array(price.length);
		obj.push(0);
		output[0] = 1;
		for(int i = 1;i < price.length;i++)	{
			while(!obj.isEmpty() && price[obj.top()] < price[i])	{
				obj.pop();
			}
			if(obj.isEmpty())	{
				output[i] = i + 1;
			}
			else	{
				output[i] = i - obj.top();
			}
			obj.push(i);
		}

	}

	public static void main(String[] args) {

		int a[] = {5,8,12,7,9};
		int output[] = new int[a.length];
		try {
			span(a,output);
		} catch (stackFullException | stackEmptyException e) {
			return;
		}
		for(int i : output)
			System.out.println(i + " ");
	}

}
