package Oops_Practice;

// Method overloading

class Maths{
	
	void sums(int a,int b)
	{
		System.out.println("This is the addition program " + (a+b));
		
	}
	
	void sums(int a,int b,int c)
	{
		System.out.println("This is the multiplication program " + (a*b*c));
		
	} 
	
	void sums(char a)
	{
		System.out.println("This is the charecter value " + (a));
		
	}
	
	void sums(float a, float b)
	{
		System.out.println("This is the float value" +(a/b));
		
	}
	
	
}

//Method over riding

class Change extends Maths{
	
		void sums(int a,int b)
		
		{
			System.out.println("This is the Subraction program " + (a-b));
			
		}
	}



public class Polymorphism {

	public static void main(String[] args) {
	
		Maths Match = new Maths();
		Match.sums(5,5);
		Match.sums('h');
		Match.sums(5,5,5);
		
		//Object for Change class
		
		Change New_Value = new Change();
		New_Value.sums(5,4);
		
		
		
		
	}

}
