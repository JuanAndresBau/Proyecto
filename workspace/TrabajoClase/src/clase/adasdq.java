package clase;

public class adasdq 
{

	public static void main(String[] args) 
	{
		System.out.println(eliminarEspacios(""));
	}
	static String eliminarEspacios (String A)
	{
		String Aprima = "";
		for (int i = 0; i<A.length();i++)
		{
			if(A.charAt(i)!=' ')
			{
				Aprima=Aprima+A.charAt(i);
			}
		}
		return Aprima;
	}

}
