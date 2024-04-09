package aggregation;

public class Child1 {

	int id;
	Parent1 p;
	
public Child1(int id,Parent1 p)
{
	this.id=id;
	this.p=p;
}

public void display()
{
	System.out.println(id);
	System.out.println(p.age);
	System.out.println(p.name);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Parent1 obj1=new Parent1("Krishna",23);
   Child1 obj2=new Child1(4,obj1);
   obj2.display();
	}

}
