public class methodoverloading
{
	public static void main(String [] args)
	{
		sum s1 = new sum();
		s1.sum(2,5);
		s1.sum(4,5,7);
		
	} 
}

class sum
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}