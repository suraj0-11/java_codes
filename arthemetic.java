import java.util.*;
public class arthemetic
{
	public static void main(String[] args)
	{
		double n1,n2,res;
		char op;
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter your 1st number : ");
		n1 = sur.nextDouble();
		System.out.println("Enter your 2nd number : ");
		n2 = sur.nextDouble();
	    System.out.println("Enter your choice : ");
	    op = sur.next().charAt(0);
	    switch(op)
	    {
	    case '+' : res = n1 + n2;
	    System.out.println(n1+" + "+n2+" = "+res);
	    break;
	    case '-' : res = n1 - n2;
	    System.out.println(n1+" - "+n2+" = "+res);
	    break;
	    case '*' : res = n1 * n2;
	    System.out.println(n1+" * "+n2+" = "+res);
	    break;
	    case '/' : res = n1 / n2;
	    System.out.println(n1+" / "+n2+" = "+res);
	    break;
	    }
	}
}