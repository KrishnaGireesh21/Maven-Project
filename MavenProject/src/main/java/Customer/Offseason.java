package Customer;

public class Offseason extends Onseason
{

	public void discount()
	{
		super.discount();
		int d2=(40*costprice)/100;
		System.out.println("Offseason: "+d2);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Offseason obj=new Offseason();
		obj.discount();

	}

}
