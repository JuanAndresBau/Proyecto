package clase;
import java.util.Scanner;
public class poblacion 
{
	public static void main(String[] args) 
	{
		/*En un momento cero en el tiempo, un país A tiene una población de x millones de habitantes y un país B 
		 * una población de y millones, donde x es mayor que y. Las tasas de crecimiento de la población son de 
		 * m% y n% respectivamente, donde n es mayor que m. ¿Cuántos años pasarán para que la población de B sea mayor que la de A?
		 */
		Scanner teclado =new Scanner(System.in);
		System.out.println("ingrese la poblacion del pais A");
		double x=teclado.nextInt();
		System.out.println("ingrese la poblacion del pais B siendo menor que la de A");
		double y=teclado.nextInt();
		System.out.println("ingrese la tasa de crecimiento del pais A");
		double m=teclado.nextInt();
		System.out.println("ingrese la tasa de crecimiento del pais B siendo mayor que la de A");
		double n=teclado.nextInt();
		System.out.println(poblacionAños(x,y,m,n));		
	}
	public static int poblacionAños (double x, double y, double m , double n)
	{		
		int contador = 0;
		for(int i = 0 ; y<x ; i++)
		{
			x=(x*m/100)+x;
			y=(y*n/100)+y;
			contador = i;
		}
		return contador+1;
	}
}
