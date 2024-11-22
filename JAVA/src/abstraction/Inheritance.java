package abstraction;

//multilevel

class gopi{
	
	void add(int a)
	{
		System.out.println("It is an integer");
	}
	
}

class gokul extends gopi
{
	void sub(float b)
	{
	System.out.println("It is a float");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		gokul g = new gokul();
		
		g.add(0);
		g.sub(0);

	}

}
