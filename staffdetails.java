import java.util.Scanner;
class Staff
{
	String name;
	String staffid;
	long phone;
	float salary;
	public void accept()
	{
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sur.nextLine();
		System.out.println("Enter your ID");
		staffid = sur.next();
		System.out.println("Enter Phone Number");
		phone = sur.nextLong();
		System.out.println("Enter your salary");
		salary = sur.nextFloat();
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Staff's ID : "+staffid);
		System.out.println("PHone NUM : "+phone);
		System.out.println("Salary : "+salary);
	}
}
class Teaching extends Staff
{
	String domain;
	int n;
	public void accept()
	{
		super.accept();
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter your domain : ");
		domain = sur.next();
		System.out.println("Enter the number of publications : ");
		n = sur.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Domain : "+domain);
		System.out.println("Publications : "+n);
	}
}
class Technical extends Staff
{
	String skill;
	public void accept()
	{
		super.accept();
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter the skill : ");
		skill = sur.nextLine();
	}
	public void display()
	{
		super.display();
		System.out.println("Skills : "+skill);
	}
}
class Contract extends Staff
{
	int period;
	public void accept()
	{
		super.accept();
		Scanner sur = new Scanner(System.in);
		period = sur.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Contract Period : "+period);
	}
}
class staffdetails
{
	public static void main(String[] args)
	{
		Teaching teaching = new Teaching();
		System.out.println("Enter the details of teaching staff :");
		teaching.accept();
		Technical technical = new Technical();
		System.out.println("Enter the details of technical staff :");
		technical.accept();
		Contract contract = new Contract();
		System.out.println("Enter the details of contract staff :");
	    contract.accept();
	    System.out.println("Details of teaching staff");
	    teaching.display();
	    System.out.println("Details of technical staff");
	    technical.display();
	    System.out.println("Details of contract staff");
	    contract.display();
	}
}













