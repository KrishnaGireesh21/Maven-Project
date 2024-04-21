package exception;

public class Class1 {

	public void div()
	{
		try
		{
		int a=9;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		
		catch(ArithmeticException z)
		{
			System.out.println("Invalid data"+z);
		}
		
		finally
		{
			System.out.println("To give message all the time");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method st
		Class1 obj=new Class1();
		obj.div();
	}

}
