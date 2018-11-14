package players;

import java.util.Random;

public class Jhon implements Player {

	public int[] move(int[][] history, int player) { 
		
		Random ñ = new Random();	 
		int []	Movimi= new int [2];
				
		int X=history[history.length-1][0];
		int Y=history[history.length-1][1];
		int R=0;
		boolean AUX=false;
			if (player == 0||player == 1) {
				/*separar el campo en una cuadricula de 3x3
				 * |---|---|---|
				 * | 1 | 2 | 3 | 
				 * |---|---|-- |
				 * |   |   |   |
				 * | 4 | 5 | 6 |
				 * |   |   |   |
				 * |---|---|-- |
				 * | 7 | 8 | 9 |
				 * |---|---|---|
				*/
				
				
				//Primer cuadrante sin contar bordes
				if(X==2||X==3&&Y==3||Y==4) {
					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
				}
				//segundo cuadrante sin contar borde 
				if(X==4||X==5||X==6&&Y==3||Y==4) {

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
				}
				//tercer cuadrante sin contar borde 
				if(X==7||X==8&&Y==3||Y==4) {

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}	
				}
				//cuarto cuadrante sin contar borde
				if(X==2||X==3&&Y==5||Y==6||Y==7||Y==8||Y==9) {

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}	
				}
				//quinto cuadrante sin contar bordes
				if(X==4||X==5||X==6&&Y==5||Y==6||Y==7||Y==8||Y==9) {

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
				}
				//sexto cuadrante sin contar bordes
				if(X==7||X==8&&Y==5||Y==6||Y==7||Y==8||Y==9) {

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
				}
				//septimo cuadrante sin bordes
				if(X==2||X==3&&Y==10||Y==11) {

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
				}
				//octavo cuadrante
				if(X==4||X==5||X==6&&Y==10||Y==11) {
					

					
					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
				}
				//Noveno cuadrante sin contar bordes
				if(X==4||X==5||X==6&&Y==10||Y==11) {
					

					R=1+ñ.nextInt(8);
					
					if(R==1) {
						  X=history[history.length-1][0];
						  Y=history[history.length-1][1];				    	   
						  Movimi[0]=X;
						  Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==2) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==3) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==4) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X+1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==5) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==6) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y+1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
					}
					if(R==7) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
							  
					if(R==8) {
						X=history[history.length-1][0];
						Y=history[history.length-1][1];				    	   
						Movimi[0]=X-1;
						Movimi[1]=Y-1; 
						  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
							  AUX=true;
							  return Movimi;}
						
						}
					}
									
				}
				//borde superior sin contar las esquinas 
				if(X==2||X==3||X==4||X==5||X==6||X==7||X==8&&Y==2) {
											
						for (int i=0;false!=AUX ; i++) {
	
						R=1+ñ.nextInt(3);
						
							if(R==1) {
								  X=history[history.length-1][0];
								  Y=history[history.length-1][1];				    	   
								  Movimi[0]=X-1;
								  Movimi[1]=Y+1; 
								  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
									  AUX=true;
									  return Movimi;}
								
							}
							if(R==2) {
								X=history[history.length-1][0];
								Y=history[history.length-1][1];				    	   
								Movimi[0]=X;
								Movimi[1]=Y+1; 
								  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
									  AUX=true;
									  return Movimi;}
								
							}
							if(R==3) {
								X=history[history.length-1][0];
								Y=history[history.length-1][1];				    	   
								Movimi[0]=X+1;
								Movimi[1]=Y+1; 
								  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
									  AUX=true;
									  return Movimi;}
								
							}
						}				  
				}
				//borde de la izquierda sin contar esquinas
				if(X==1&&Y==3||Y==4||Y==5||Y==6||Y==7||Y==8||Y==9||Y==10||Y==11) {

					
					R=1+ñ.nextInt(3);
					
						if(R==1) {
							  X=history[history.length-1][0];
							  Y=history[history.length-1][1];				    	   
							  Movimi[0]=X+1;
							  Movimi[1]=Y-1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
						if(R==2) {
							X=history[history.length-1][0];
							Y=history[history.length-1][1];				    	   
							Movimi[0]=X+1;
							Movimi[1]=Y; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
						if(R==3) {
							X=history[history.length-1][0];
							Y=history[history.length-1][1];				    	   
							Movimi[0]=X+1;
							Movimi[1]=Y+1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
					
					
				}
				//borde de la derecha sin contar esquinas
				if(X==9&&Y==3||Y==4||Y==5||Y==6||Y==7||Y==8||Y==9||Y==10||Y==11) {


					
					R=1+ñ.nextInt(3);
					
						if(R==1) {
							  X=history[history.length-1][0];
							  Y=history[history.length-1][1];				    	   
							  Movimi[0]=X-1;
							  Movimi[1]=Y-1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
						if(R==2) {
							X=history[history.length-1][0];
							Y=history[history.length-1][1];				    	   
							Movimi[0]=X-1;
							Movimi[1]=Y; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
						if(R==3) {
							X=history[history.length-1][0];
							Y=history[history.length-1][1];				    	   
							Movimi[0]=X-1;
							Movimi[1]=Y+1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
					
					
				
					
				}
				//borde inferior sin contar esquinas 
				if(X==2||X==3||X==4||X==5||X==6||X==7||X==8&&Y==12) {


					
					R=1+ñ.nextInt(3);
					
						if(R==1) {
							  X=history[history.length-1][0];
							  Y=history[history.length-1][1];				    	   
							  Movimi[0]=X-1;
							  Movimi[1]=Y-1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
						if(R==2) {
							X=history[history.length-1][0];
							Y=history[history.length-1][1];				    	   
							Movimi[0]=X;
							Movimi[1]=Y-1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
						if(R==3) {
							X=history[history.length-1][0];
							Y=history[history.length-1][1];				    	   
							Movimi[0]=X+1;
							Movimi[1]=Y-1; 
							  if((DeterminarMOV(Movimi,history)==true)&&(limitacion(Movimi[0],Movimi[1]))){
								  AUX=true;
								  return Movimi;}
							
						}
				}
			}
		return null;
		}

	


	private static boolean limitacion (int X, int Y) {
		   if ((Y>1)&&(Y<13)&&(X>0)&&(X<10)) {
			   return true;}
		   if (((Y==2)||(Y==12))&&(X>1)&&(X<9)){return true;}
		   
			    return false;
			  }
	  

	static boolean DeterminarMOV(int []FutMov,int[][]history) {
		
		
		 if (history.length>1){
			
			boolean permiteX=false;
			boolean permiteY=false;
		   int Posx=history[history.length-1][0];
	      int Posy=history[history.length-1][1];
	      
	      
			for (int i=0;i<history.length-1;i++){
				
				if (history[i][0]== Posx){
					if (history[i+1][0]== FutMov[0]) {
						permiteX =false;}
					else {permiteX= true;}
				}
				if (history[i][1]==Posy){
					if (history[i+1][1]== FutMov[1]) {
						permiteY=false;}
					else {permiteY= true;}
				}



				}
			return (permiteY||permiteX);	
		 } 
		 return false;}
	}