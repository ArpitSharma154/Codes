@FunctionalInterface
interface SampleInterface
{
	int add(int a , int b);
}

public class Lamda_1 {

	public static void main(String args[])
	{
	  SampleInterface sum = (a,b)-> a+b;
	  int amount = sum.add(10, 13);
	  System.out.println(amount);
	}
}
