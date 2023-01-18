package suraj;

public class Constructor 
{
	int id;
	String name;
	Constructor()
	{
		System.out.println("This is default constructor");
		System.out.println("Student ID : "+id+"\nStudent Name : "+name);
	}
	Constructor(int i,String n)
	{
		System.out.println("This is parameterized constructor\n");
		id = i;
		name = n;
		System.out.println("Student ID : "+id+"\nStudent Name : "+name);
	}
	public static void main(String args[])
	{
		Constructor s = new Constructor();
		Constructor student = new Constructor(10,"Suraj");
	
	}
}
