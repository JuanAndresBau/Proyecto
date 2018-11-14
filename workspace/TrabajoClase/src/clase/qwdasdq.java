package clase;

public class qwdasdq 
{
	public static void main(String[] args) 
	{
		System.out.println(MinComMul(4,3,2));
	}
	public static int potencia (int a, int b) 
	{
		int multi = 1;
		for(int i = 0; i<b ; i++)
			multi=multi*a;
		return multi;
	}
	public static int MinComMul (int num1, int num2, int num3)
	{
		int r = 0;
		int min = (Math.min(num1, num2));
		int R = (Math.min(num3,min));
        int mcm = 0;
        for (int i=1; i<=R; i++) 
        {
            if (num1%i==0 && num2%i==0) 	
            {
                int mcd = i;
                mcm = (num1*num2)/mcd;
            }
                if(num3%i==0 && mcm%i==0)
                {
                	int mcd = i;
                	r = (mcm*num3)/mcd;
                }
        }
        return r;
	}
}
