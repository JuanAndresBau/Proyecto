package players;
//import java.util.Random;
public class SuJugador implements Player 
{
	public int[] move(int[][] history, int player) 
	{
		//int logical[]=new  int[] {-1,0,1};
		{
		//	Random aleator= new Random();
		//	int aux=aleator.nextInt(3);
		//	int auxR= logical[aux];
			int []	Move= new int [2];
			int x=history[history.length-1][0];
			int y=history[history.length-1][1];
				/*.
				 * |---|---|---|
				 * | 1 | 2 | 3 | 
				 * |---|---|---|
				 * |           |
				 * |     4     |
				 * |           |
				 * |___________|
				 * | 5 | 6 | 7 |
				 * |---|---|---|
				 */
			if (player == 0)
			{
				// CUANDO LLEGUE A LA CACHA DE ARRIBA
				if((x==4)&&(y==2))
				{
					if(casos(1, history)== true);
					{
						return Move;
					}
				}
				if((x==5)&&(y==2))
				{
					if(casos(2, history)== true);
					{
						return Move;
					}
				}
				if((x==6)&&(y==2))
				{
					if(casos(3, history)== true);
					{
						return Move;
					}
				}
				//Medio Total
				if((x==5)&&(y==7))
				{
					if(casos(1, history)== true);
					{
						return Move;
					}
				}
			}
			return null;
		}
	}
public static boolean casos(int $id,int[][]history) 
{
	{
		int []	Move= new int [2];
		int x=history[history.length-1][0];
		int y=history[history.length-1][1];
		switch ($id)
		{
		case 1: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])==true))
					return true;
				
		case 2: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y-1; 
				break;
				
		case 3: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y-1; 
				break;
				
		case 4: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x;
				Move[1]=y+1; 
				break;
				
			
		case 5: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y; 
				break;
				
		case 6: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y; 
				break;
				
		case 7: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y+1; 
				break;
				
		case 8: x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y+1; 
				break;
				
		}
	}
	return false;
}
public static boolean limit (int x, int y) 
	{
		   if ((x>=1)&&(x<=9)&&(y>=2)&&(y<=12)) 
		   {
			   return true;
		   }		   
		   if (((y==1)||(y==13))&&(x==4)||(x==5)||(x==6))
		   {
			   return true;
		   }
		   return false;
	}
public static boolean validMove(int []FutMov,int[][]history) 
	{		
		 if (history.length>1)
		 {			
			boolean permitex=false;
			boolean permitey=false;
			int Posx=history[history.length-1][0];
			int Posy=history[history.length-1][1];
	      
			for (int i=0;i<history.length-1;i++)
			{
				
				if (history[i][0]== Posx)
				{
					if (history[i+1][0]== FutMov[0]) 
					{
						permitex =false;
					}
					else 
					{
						permitex= true;
					}
				}
				if (history[i][1]==Posy)
				{
					if (history[i+1][1]== FutMov[1]) 
					{
						permitey=false;
					}
					else 
					{
						permitey= true;
					}
				}
			}
			return (permitey||permitex);	
		 } 
		 return false;
	}
}