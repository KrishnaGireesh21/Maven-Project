package Firstproject;

public class Classb {
int id;
Classa ag;

public Classb(int id,Classa ag)
{
	this.id=id;
	this.ag=ag;
	
}

public void display()
{
	System.out.println(id);
	System.out.println(ag.age);
	System.out.println(ag.name);

}
public static void main(String[] args)
{
	Classa obj1=new Classa("Krishna",23);
	Classb obj2=new Classb(1,obj1);
	obj2.display();
}
}
