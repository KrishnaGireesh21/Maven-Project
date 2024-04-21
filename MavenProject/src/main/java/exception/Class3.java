package exception;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	//int a=5;
	//int b=a/0;
	//System.out.println(b);
	
    int a[]=new int[5];    
    
    System.out.println(a[10]);  
	
}
catch(ArithmeticException e)
{
	System.out.println("ArithmeticException occurs");
	
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("ArrayIndexOutofBoundsException occurs");
}

catch(Exception e)
{
	System.out.println("Exception occurs");
}
	}

}
