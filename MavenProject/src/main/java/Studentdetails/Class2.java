package Studentdetails;

public class Class2 {
	
	String address;
	Class1 d;
	
public Class2(String address,Class1 d)
{
	this.address=address;
	this.d=d;
	
}

public void display()
{
System.out.println("Name:"+d.name);
System.out.println("Roll No:"+d.roll);
System.out.println("Address:"+address);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Class1 obj=new Class1("Sathya",23);
		Class2 obj1=new Class2("Palakkad",obj);
		obj1.display();
	}

}
