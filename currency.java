import java.util.*;
public class currency
{
    public static void main(String[] args)
    {
    	System.out.println("Enter\n"
    			+ "1. for USD to INR\n"
    			+ "2. for INR to USD\n"
    			+ "3. for YEN to INR\n"
    			+ "4. for INR to YEN\n");
    	Scanner sur = new Scanner(System.in);
    	int choice = sur.nextInt();
    	switch(choice)
    	{
    	case 1 : usdtoinr();
    	         break;
    	case 2 : inrtousd();
    	         break;
    	case 4 : inrtoyen();
                 break;
    	case 3 : yentoinr();
                 break;
    	}
    }
    static void inrtousd()
	{
    	Scanner sur = new Scanner(System.in);
		double inr,usd;
		System.out.println("Enter the amount in ruppees : ");
		inr = sur.nextDouble();
		usd = inr/(82.73);
		System.out.println(usd + " Dollars");
	}
	static void usdtoinr()
	{
		Scanner sur = new Scanner(System.in);
		double inr,usd;
		System.out.println("Enter the amount in dollars : ");
		usd = sur.nextDouble();
		inr = usd*(82.73);
		System.out.println("Rs."+inr);
	}
	static void yentoinr()
	{
		Scanner sur = new Scanner(System.in);
		double yen,inr;
		System.out.println("Enter the amount in yen : ");
        yen = sur.nextDouble();
        inr = yen/(1.65);
        System.out.println("Rs."+inr);
	}
	static void inrtoyen()
	{
		Scanner sur = new Scanner(System.in);
		double yen,inr;
		System.out.println("Enter the amount in ruppees : ");
        inr = sur.nextDouble();
        yen = inr*(1.65);
        System.out.println(yen+" yen");
	}
}