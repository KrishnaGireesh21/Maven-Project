package practicehw;

public class Class2 extends Class1{


	public void display()
	{
		
if(super.add()%10==0)
{
	System.out.println("Divisible");
	
}
else {
	System.out.println("Not Divisible");
}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class2 obj=new Class2();
obj.display();
	}

}
