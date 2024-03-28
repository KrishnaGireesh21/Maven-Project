package Polymorphism;

public class Child extends Parent
{
	
public void add()
{
	super.add();
	int e=a+c;
	System.out.println(e);
	
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Child obj=new Child();
obj.add();
	}

}
