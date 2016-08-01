package lecture12;

public class genericBubbleSort {

	public static<T extends comparable<T>> void bubbleSort(T[] a) {
		for(int j = 0; j < a.length; j++) {
			for(int i = 0; i < a.length-1-j; i++) {
				if(a[i].isgreater(a[i+1])) {					//calling isgreater and passing a[i+1]
					T temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Student s[] = new Student[10];
		for(int i = 0;i < 10;i++)	{
			s[i] = new Student();
			s[i].marks = 100-i;
		}
		bubbleSort(s);
		for(int i = 0;i < 10;i++)	{
			System.out.println(s[i].marks);
		}
		
	}

}
