package cleancode.constructioncost;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
       double no_of_square_feet;
       int choice;
       Scanner sc=new Scanner(System.in);
       System.out.format("Enter Area of house in square Feet\n");
       no_of_square_feet=sc.nextDouble();
       System.out.format("Enter the Material Standard");
       System.out.format("\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n");
       choice=sc.nextInt();
       ConstructionCost obj=new ConstructionCost(no_of_square_feet,choice);
       if(choice==1||choice==2||choice==3)
       {
    	   System.out.format("House construction cost is "+obj.houseConstructionCost(no_of_square_feet,choice)+"INR");
       }
       else
       {
    	   System.out.format("Invalid Input");
       }
    }
}
