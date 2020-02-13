import java.util.*;
class Factorial
{
	public static void main(String [] args)
	{
    int fact=1; 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the  number");
	 int num1= sc.nextInt();
	 while(num1>0)
	 {
			 fact=fact*num1;		
		  num1=num1-1;
		}	 
	 
	 System.out.println(fact);
	 	
	}
}