package aggregation;

public class Class2 {

	String s;
	Class1 ag;
	
public Class2(String s,Class1 ag)
{
	this.s=s;
	this.ag=ag;
	
}
	public void display()
	{
		System.out.println(ag.name);
		System.out.println(ag.roll);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj1=new Class1("Krishna",45);
		Class2 obj2=new Class2("Thrissur",obj1);
		obj2.display();

	}

}
