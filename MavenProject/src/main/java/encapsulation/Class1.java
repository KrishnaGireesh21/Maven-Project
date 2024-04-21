package encapsulation;

public class Class1 {

	private String s;
	private int b;
	
	public void setter(String s,int b)
	{
	this.s=s;
	this.b=b;
	}
	public void getter()
	{
	System.out.println(s);
	System.out.println(b);
	}
}
