package inheritance;

public class Child extends Parent
{
	public void print()
	{
		display();

	System.out.println("hiiii "+number);
	
	}

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.print();
		//obj.display();
	}

}
