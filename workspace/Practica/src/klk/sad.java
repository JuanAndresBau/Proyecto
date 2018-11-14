package klk;
import java.util.Scanner;
public class sad 
{
	public static void main(String[] args) 
	{
		Scanner teclado=new Scanner (System.in);
		System.out.println("digite una palabra");
		String p = teclado.next();
		System.out.println(esAnagrama("roma","rmap"));
	}
	//Contar la cantidad de veces que aparece un char en una cadena
	public static int cantidadVeces (String p, char w)
	{
		int contador = 0;
		for(int i=0 ; i<p.length() ; i++)
		{
			if(p.charAt(i) == w)
			{
				contador = contador +1;
			}
		}
		return contador;
	}
	//indicar la posicion de la primera aparicion de un char en una cadena
	public static int primeraPosicion (String p, char w)
	{
		for(int i=p.length()-1;i<p.length();i--)
		{
			if(p.charAt(i) == w)
			{
				return i;
			}
		}
		return -1;
	}
	//Escriba una función que reciba como entrada dos cadenas S y T, y determine si S es anagrama de T. 
	public static boolean esAnagrama (String s, String t)
	{
		char[] letras1 = s.toCharArray();
		char[] letras2 = t.toCharArray();
		boolean aux=false;
		for (int i=0 ; i<letras1.length-1 ; i++)
		{
		    for (int y=letras1.length-1 ; y>0 ; y--)
		    {
		      if(letras1[i] == letras2[y])
		      {
		          aux=true;
		      }
		    }
		}
		return aux;
	}
}
