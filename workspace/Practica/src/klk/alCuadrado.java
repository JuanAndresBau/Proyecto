package klk;

public class alCuadrado 
{

	public static void main(String[] args) 
	{
		int n=4;
		cuadrado(n);
		System.out.print(n);
	}
	public static void cuadrado(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;i++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
