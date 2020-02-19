package cleancode.constructioncost;
import java.util.Scanner;
public class ConstructionCost {
	     double no_of_square_feet ;
	     int choice;
	     String fully_automated;
	     ConstructionCost(double no_of_square_feet,int choice)
	     {
	          this.no_of_square_feet=no_of_square_feet;
	          this.choice=choice;
	     }
	     public double houseConstructionCost(double no_of_square_feet,int choice)
	     {
	    	 double result=0.0;
	    	 
	          if(choice==1)
	          {
	              result=no_of_square_feet*1200;
	          }
	          else if(choice==2)
	          {
	              result=no_of_square_feet*1500;
	          }
	          else if(choice==3)
	          {
	        	  System.out.format("You want Fully Automated Home yes/no ");
	        	  Scanner sc=new Scanner(System.in);
	              fully_automated=sc.next();
	        	  if(fully_automated.equals("no"))
	        	  {
	        		  result=no_of_square_feet*1800;
	        	  }
	        	  else if(fully_automated.equals("yes"))
	        	  {
	        		  result=no_of_square_feet*2500;
	        	  }
	          }
	          return result; 
	     }

}
