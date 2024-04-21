package hw;

public class Class1 {
private int p;
private int[] validpin= {1001, 1234, 1212}
public void setter(int p)
{
	this.p=p;
}

public void getter()
{
	for(p:validpin)
	{
		if(p==validpin)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Not Valid");
		}
	}

}


}
/*
 * Program to withdraw amount from an ATM 
 *  Class 1- Bank One method to set pin from „User‟ class and validate Pin in another method [Valid pins – 1001, 1234, 1212]
 *   Pin number should declared as private  Class 2 – User Get the pin from User*/
 
