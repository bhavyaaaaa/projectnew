import java.util.*;
public class PowerUsingExceptions
{
    public static int powerfunction(int a,int b) throws Exception
	    {
	        if(a<0 || b<0)
	        {
	            throw new Exception ("a or b should not be negative.");
	            
	        }
	        else if(a==0 && b==0)
	        {
	            throw new Exception ("a and b should not be zero");
	        } 
	        else
	        {
	            return((int)Math.pow(a,b));
	        }
	    }
	public static void main(String[] args)
    	{
    	    Scanner sc=new Scanner(System.in);
    	    int a = sc.nextInt();
    	    int b = sc.nextInt();
    	        
    	        try 
    	        {
    	            if(a<=10 && b<=10)
    	            {
    	                System.out.println(powerfunction(a, b));
    	            }
    	            else
    	            {
    	                throw new Exception ("Out of range.");
    	            }
    	            
    	        } 
    	        catch (Exception e) 
    	        {
    	            System.out.println(e);
    	            
    	        }
    	}
}

