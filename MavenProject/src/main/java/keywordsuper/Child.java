package keywordsuper;

public class Child extends Parent{

	public Child()
	{
		super();
	}
	public void display()
	{
		
		super.a=a;
		System.out.println("Super keyword program");
		System.out.println(super.a);
		System.out.println(super.b);
		super.mul();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj1=new Child();
obj1.display();
	}

}
