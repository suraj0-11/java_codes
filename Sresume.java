package suraj;
interface Resume
{
	void biodata();
}
class Teacher implements Resume
{
	String name,qualification,achievements;
	float exp;
	public void biodata()
	{
		name = "suraj";
		qualification = "M. Tech,(Ph.D)";
		achievements = "Q1 publications";
		exp = 8.6f;
		System.out.println("Teacher Resume\n");
		System.out.println("\nName : "+name);
		System.out.println("Qualification : "+qualification);
		System.out.println("Achievements : "+achievements);
		System.out.println("Experience : "+exp);
	}
}
class Student implements Resume
{
	String name,discipline;
	float result;
	public void biodata()
	{
		name = "sristi";
		result = 9.8f;
		discipline = "Information and engineering";
		System.out.println("\nStudent Resume");
		System.out.println("Name : "+name);
		System.out.println("Result : "+result);
		System.out.println("Discipline :"+discipline);
	}
}
public class Sresume
{
	public static void main(String args[])
	{
		Teacher obj1 = new Teacher();
		obj1.biodata();
		Student obj2 = new Student();
		obj2.biodata();
	}
}
