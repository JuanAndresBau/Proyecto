package klk;
public class Quiz 
{
	public static void main(String[] args) 
	{
		System.out.println("El menor valor de la sucesión es"+ " "+ numeros(4,2,9));
		System.out.println("La población de A a B, es superada en "+poblacionPaises(2000000, 1000000, 0.25, 0.50)+" "+"años");
	}
		static int numeros(int a, int b, int c) 
		{
			int x0=a;
			int xi=x0*b%c;
			int menor=a;
			while(xi!=a) 
			{
				xi=xi*b%c;
				if(xi<menor) 
				{
					menor=xi;
				}
			}
		return menor; 
		}
		static double poblacionPaises(double x, double y, double m, double n) 
		{
			x=2000000;
			y=1000000;
			m=0.25;
			n=0.50;
			int t=0;
			while(x>y)
			{
				x=x*m+x ; 
				y=y*n+y;
				t++;
			}
		return t;
		}
		
}