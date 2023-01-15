import java.util.*;
public class checkprime {

	public static void main(String[] args)
	{
		Double num;
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sur.nextDouble();
		boolean flag = false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
				
				
	   sur.close();
	}

}
