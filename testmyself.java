import java.util.*;
public class  testmyself
{
	public static void main(String[] args)
	{
		double a,b,res;
		char op;
		System.out.println("Enter 2 numbers");
		Scanner ok = new Scanner(System.in);
		a = ok.nextDouble();
		b = ok.nextDouble();
		System.out.println("Enter the operator");
		op = ok.next().charAt(0);
		switch(op)
		{
		case '+' : res = a + b;
		System.out.println(res);
		break;
		case '-' : res = a - b;
		System.out.println(res);
		break;
		case '*' : res = a * b;
		System.out.println(res);
		break;
		case '/' : res = a / b;
		System.out.println(res);
		break;
		}
	}
}