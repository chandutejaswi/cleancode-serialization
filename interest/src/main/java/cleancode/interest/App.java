package cleancode.interest;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	double principle,time,rate_of_interest;
    	Scanner sc=new Scanner(System.in);
    	System.out.format("Enter principle amount:");
    	principle=sc.nextFloat();
    	System.out.format("Enter time period:");
    	time=sc.nextFloat();
    	System.out.format("Enter rate of interest:");
    	rate_of_interest=sc.nextFloat();
    	Interest obj=new Interest(principle,time,rate_of_interest);
    	int option;
    	System.out.format("\n1.Simple Interest\n2.Compound Interest\n");
    	System.out.format("Enter choice: ");
    	option=sc.nextInt();
    	if(option==1)
    	{
    		System.out.format("Simple Interest is %.2f",obj.simpleInterest(principle,time,rate_of_interest));
    	}
    	else if(option==2)
    	{
    		System.out.format("Compound Interest is %.2f",obj.compoundInterest(principle, time, rate_of_interest));
    	}
    	else
    	{
    		System.out.format("Invalid choice");
    	}
    }
}
