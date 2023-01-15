import java.util.Scanner;
public class Arithmetic
{
	public static void main(String[] args)
	{
		double x,y,res;
		char op;
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		x = sur.nextDouble();
		System.out.println("Enter the 2nd Number : ");
		y = sur.nextDouble();
		System.out.println("Enter the operator : ");
		op = sur.next().charAt(0);
		switch(op)
		{
		case '+' : res = x + y; 
		System.out.println(x+"+"+y+" = "+res);
		break;
		case '-' : res = x - y; 
		System.out.println(x+"-"+y+" = "+res);
		break;
		case '*' : res = x * y; 
		System.out.println(x+"*"+y+" = "+res);
		break;
		case '/' : res = x / y; 
		System.out.println(x+"/"+y+" = "+res);
		break;
		}
		sur.close();
	}
}