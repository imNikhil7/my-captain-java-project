import java.util.*;
public class PrimeNumbers

{
	
	 public static void main(String args[])
	{    
	  int num,m,flag=0;      
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number");
	 num=sc.nextInt();       
	 m=num/2;
	  if(num==0||num==1)
	{  
	   System.out.println(num+" :not prime number");      
	  }
	else
	{
	   for(int i=2;i<=m;i++)
	{      
	    if(num%i==0)
	   {      
	     System.out.println(num+" :not prime number");      
	     flag=1;      
	     break;      
	    }      
	  }      
	   if(flag==0) 
	System.out.println(num+" :prime number"); 
	}
}
}
