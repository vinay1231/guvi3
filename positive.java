import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n;
		 Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
	if(n>0)
	{
		 System.out.println("Positive");
	}
	else if(n<0)
	{
		 System.out.println( "Negative");
	}
	else
	{
		System.out.println("zero");
	}		
	}
}
