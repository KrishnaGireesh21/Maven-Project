package Polymorphism;

public class Child1 extends Parent1{

	public void mul()
	{
		super.mul();
		int e=b*c;
		System.out.println(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj=new Child1();
		obj.mul();
	}

}
