import java.util.*;
public class stud_details {
String usn,name,branch;
long phone;
void insertstudent(String reg,String nm,String br,long ph)
{
	usn = reg;
	name = nm;
	branch = br;
	phone = ph;
}
void displaystudent()
{
	System.out.println("-------------------------");
	System.out.println("Name = "+name);
	System.out.println("USN = "+usn);
	System.out.println("Branch = "+branch);
	System.out.println("PHONE NUMBER = "+phone);
	System.out.println("-------------------------");
}
	
	
	
	public static void main(String[] args) {
		stud_details st[] = new stud_details[100];
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sur.nextInt();
		for(int i=0;i<n;i++)
			st[i] = new stud_details();
		for(int j=0;j<n;j++) 
		{
			System.out.format("STUDENT %d\n",j+1);
			System.out.println("Enter your USN : ");
			String usn = sur.next();
			System.out.println("Enter your NAME : ");
			String name = sur.next();
			System.out.println("Enter your BRANCH : ");
			String branch = sur.next();
			System.out.println("Enter your PHONE NUMBER : ");
			long phone = sur.nextLong();
			st[j].insertstudent(usn, name, branch, phone);
		}
		for(int m=0;m<n;m++)
		{
			System.out.format("Student %d details are \n",m+1);
			st[m].displaystudent();
		}
		sur.close();

	}

}
