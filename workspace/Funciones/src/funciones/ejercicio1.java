package funciones;

public class ejercicio1 
{
	
	public static void main(String[] args) 
	{
		System.out.println(esPar(2));
		System.out.print(valorAbsoluto(-10));
	}
	public static int valorAbsoluto(int n)
	{
		if (n<0)
		{
			n=(n*-1);
		}
		return n;
	}
	public static boolean esPar (int x)
	{
		if (x%2==0)
		{
			return true;
		}
		return false;
	}

}
