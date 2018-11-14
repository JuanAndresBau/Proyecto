package funciones;
import java.util.Scanner;
public class ejercicio2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println(leer_y_sumar_datos(11 , teclado));
		//System.out.println(promedio(5, teclado));
	}
	static int leer_y_sumar_datos(int n, Scanner lector) 
	{ 
		int suma = 0;
		for (int i = 0; i < n; i++) 
			suma = suma + lector.nextInt();
		return suma;
	}
	static double promedio(int n, Scanner lector)
	{
		int a;
		a=(leer_y_sumar_datos(n, lector));
		n=a/n;
		return n;
	}

}
