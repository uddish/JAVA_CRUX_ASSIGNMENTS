package java_assignment9;

public class ans_4 {

	public static Boolean bracketCheck(String s)	{
		queue_LL<Character> obj = new queue_LL<Character>();
		int countE = 0;
		int countB = 0;
		for(int i = 0;i < s.length();i++)	{
			obj.enqueue(s.charAt(i));
		}
		while(obj.size !=0 )	{

			if(obj.front() == '(')	{
				countB++;
				obj.dequeue();
			}
			else if(obj.front() == '+' ||  obj.front() == '-' || obj.front() == '*' || obj.front() == '/')	{
				countE++;
				obj.dequeue();
			}
			else	{
				obj.dequeue();
			}
			
		}
		if(countB > countE)	{
			System.out.println(countB);
			System.out.println(countE);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "((a+b)+((c+d)))";
		System.out.println(bracketCheck(s));
	}

}
