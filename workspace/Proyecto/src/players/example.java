package players;
/*package players;
import java.util.Random;

public class SuJugador implements Player 
{
	private static final int logical[]=new  int[] {-1,0,1}; 
	public int[] move(int[][] history, int player)
	{
		Random aleator= new Random();
		
		int aux=aleator.nextInt(3);
		int auxR= logical[aux];
		int []	Move= new int [2];
		int x=history[history.length-1][0];
		int y=history[history.length-1][1];
		if (player == 1)
		
		{/*.
			 * |---|---|---|
			 * | 1 | 2 | 3 | 
			 * |---|---|---|
			 * |           |
			 * |     4     |
			 * |           |
			 * |___________|
			 * | 5 | 6 | 7 |
			 * |---|---|---|
			
			
			// CUANDO LLEGUE A LA CACHA DE ARRIBA
			//por eso hacia estos casos
			if((x==4)&&(y==2))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y-1;
				System.err.println("X es "+x+"Y es "+y);
				return Move;
			}
			if((x==5)&&(y==2))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x;
				Move[1]=y-1; 
				System.err.println("X es "+x+"Y es "+y);
				return Move;
			}
			if((x==6)&&(y==2))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y-1; 
				System.err.println("X es "+x+"Y es "+y);
				return Move;
			}
			if((x==1)&&(y>2)&&(y<12))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x==1)&&(y>2)&&(y<12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==1)&&(y>2)&&(y<12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}
			//BORDE LATERAL DERECHO SIN ESQUINAS
			if((x==9)&&(y>2)&&(y<12))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x==1)&&(y>2)&&(y<12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==1)&&(y>2)&&(y<12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}
			//BORDE INFERIOR ZONA IZQUIEDA DE LA CANCHA SIN ESQUINAS
			if((x>1)&&(x<4)&&(y==12))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x>1)&&(x<4)&&(y==12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x>1)&&(x<4)&&(y==12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				
			}
			//BORDE INFERIOR ZONA DERECHA DE LA CANCHA SIN ESQUINAS
			if((x>6)&&(x<9)&&(y==12))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x>6)&&(x<9)&&(y==12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x>6)&&(x<9)&&(y==12))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}
			//BORDE SUPERIOR ZONA IZQUIEDA DE LA CANCHA SIN ESQUINAS
			if((x>1)&&(x<4)&&(y==2))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y+1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x>1)&&(x<4)&&(y==2))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x>1)&&(x<4)&&(y==2))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				
			}
			//BORDE SUPERIOR ZONA DERECHA DE LA CANCHA SIN ESQUINAS
			if((x>6)&&(x<9)&&(y==2))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y+1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x>6)&&(x<9)&&(y==2))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x>6)&&(x<9)&&(y==2))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}
			//ZONA 1(DIAGONAL IZQUIERDA ARRIBA)
			if((x==2)||(x==3)&&(y==3)||(y==4)||(y==5))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x+1;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x==2)||(x==3)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==2)||(x==3)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==2)||(x==3)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}
			//ZONA 2(MEDIO ARRIBA)
			if((x==4)||(x==5)||(x==6)&&(y==3)||(y==4)||(y==5))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x==4)||(x==5)||(x==6)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==4)||(x==5)||(x==6)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==4)||(x==5)||(x==6)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==4)||(x==5)||(x==6)&&(y==3)||(y==4)||(y==5))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}
				
			//ZONA 3(DIAGONAL DERECHA ARRIBA)
			if((x==7)||(x==8)&&(y==3)||(y==4)||(y==5))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x-1;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x==2)&&(y==3)||(y==4))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==2)&&(y==3)||(y==4))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y+1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x==2)&&(y==3)||(y==4))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
			}	
			//ZONA 4 (DEL MEDIO)
			else if((x>1)&&(x<9)&&(y>5)&&(y<10))
			{
				x=history[history.length-1][0];
				y=history[history.length-1][1];				    	   
				Move[0]=x;
				Move[1]=y-1; 
				if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
				{
					System.err.println("X es "+x+"Y es "+y);
				  return Move;
				}
				else if((x>1)&&(x<9)&&(y>5)&&(y<10))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+1;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else if((x>1)&&(x<9)&&(y>5)&&(y<10))
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x-1;
					Move[1]=y-1; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])))
					{
						System.err.println("X es "+x+"Y es "+y);
					  return Move;
					}
				}
				else 
				{
					x=history[history.length-1][0];
					y=history[history.length-1][1];				    	   
					Move[0]=x+auxR;
					Move[1]=y+auxR; 
					if((validMove(Move,history)==true)&&(limit(Move[0],Move[1])));
					return Move;
				}
			}	
		}
		return null;
	*/