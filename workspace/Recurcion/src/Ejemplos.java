//   Ejemplos de recursiòn
public class Ejemplos 
{

	public static void main(String[] args) 
	{
		System.out.println(potencia(2,5));
	}
	//S(x-1)+ x si x !0 en una recursion
	static int s(int x)
	{
		if(x==0)
		{
			return 0;
		}
		else
			return s(x-1)+x;
	}
	//dado un numero natural n, calcule n! en una recursion
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
			return factorial(n-1)*n;
	}
	//Dado un numero natural n, determine si es par o no en una recursion
	public static boolean esPar(int n)
	{
		if(n==0)
		{
			return true;
		}
		else if(n==1)
		{
			return false;
		}
		else return esPar(n-2);
	}
	//Dado un numero Real x y un natural n, calcule x en una recursion
	public static double potencia(double x, double n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n==1)
		{
			return x;	
		}
		else return potencia(x,n-1)*x;		
	}
}
