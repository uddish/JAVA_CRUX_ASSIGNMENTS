package lecture12;

public class Student implements comparable<Student>	{
	
	String name;
	int marks;
	
	public Boolean isgreater(Student a)	{
		if(this.marks > a.marks)	{
			return true;
		}
		else
			return false;
	}

}
