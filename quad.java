package Practice;
import java.util.*;
public class quad {

	public static void main(String[] args) {
		double a,b,c,d,r1,r2;
		System.out.println("Enter 3 co-efficients : ");
		Scanner sur = new Scanner(System.in);
		//a,b,c are coefficient of the equation
		a = sur.nextInt();
		b = sur.nextInt();
		c = sur.nextInt();
		d = (b*b)-(4*a*c);
		if(d>0)
		{
			System.out.println("Roots are real and equal");
			r1 = (-b + Math.sqrt(d))/(2*a);
			r2 = (-b + Math.sqrt(d))/(2*a);
			System.out.println("roots are : "+r1);
			System.out.println("roots are : "+r2);
		}
		else if(d==0)
		{
			System.out.println("Roots are real and equal");
			r1 = (-b)/(2*a);
			r2 = r1;
			System.out.println("roots are : "+r2);
			System.out.println("roots are : "+r2);
		}
		else
		{ 
			double real = -b/(2*a);
			double img = Math.sqrt(-d)/(2*a);
			System.out.format("root 1 = %.2f + %.2fi\n",real,img);
			System.out.format("root 2 = %.2f - %.2fi\n",real,img);
		}
		
sur.close();
	}

}
