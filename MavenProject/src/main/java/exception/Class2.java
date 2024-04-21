package exception;

public class Class2 {

	int age=4;
	public void eligiblity()
	{
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			//System.out.println("Not Eligible");
			throw new ArithmeticException("Not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class2 obj=new Class2();
obj.eligiblity();
	}

}
