package org.IP.sesion05;

public class pixelart {

	public static void main(String[] args) {
		//matriz de enteros de 40x40
			final String PIXEL = "   "; // dos caracteres en blanco, solo muestra color de fondo
			// Background
			// System.out.print("\033[40m" + PIXEL); // BLACK
			// System.out.print("\033[41m" + PIXEL); // RED
			// System.out.print("\033[42m" + PIXEL); // GREEN
			// System.out.print("\033[43m" + PIXEL); // YELLOW
			// System.out.print("\033[44m" + PIXEL); // BLUE
			// System.out.print("\033[45m" + PIXEL); // PURPLE
			// System.out.print("\033[46m" + PIXEL); // CYAN
			// System.out.print("\033[47m" + PIXEL); // WHITE
			// System.out.println();
			// High Intensity backgrounds
			// System.out.print("\033[0;100m" + PIXEL); // BLACK_BRIGHT
			// System.out.print("\033[0;101m" + PIXEL); // RED_BRIGHT
			// System.out.print("\033[0;102m" + PIXEL); // GREEN_BRIGHT
			// System.out.print("\033[0;103m" + PIXEL); // YELLOW_BRIGHT
			// System.out.print("\033[0;104m" + PIXEL); // BLUE_BRIGHT
			// System.out.print("\033[0;105m" + PIXEL); // PURPLE_BRIGHT
			// System.out.print("\033[0;106m" + PIXEL); // CYAN_BRIGHT
			// System.out.print("\033[0;107m" + PIXEL); // WHITE_BRIGHT
			
			// asignamos al color blanco el 1, al negro el 2 y al amarrillo el 3
			int [][] emoji = new int[15][15];
			//F0 
			emoji[0][0]=1;
			
	        for (int i = 1; i < 8; i++) {
	            emoji[i][0]=2;
	        }
	        for(int i=8; i<15;i++) {
	        emoji[i][0]=1;   
	        }
	        //F1
	        for (int i = 0; i < 10; i++) {
	            emoji[i][1]=2;
	        }
	        for(int i=10;i<15;i++) {
	        	emoji[i][1]=1;
	        }
	        //F2 
	        for (int i = 0; i < 11; i++) {
	            emoji[i][2]=2;
	        }
	        for(int i = 10; i<15;i++) {
	        	emoji[i][2]=1;
	        }
	        //F3
	        for(int i=0;i<5;i++) {
	        	emoji[i][3]=2;
	        }
	        for(int i=5;i<10;i++) {
	        	emoji[i][3]=1;
	        }
	        for(int i=10;i<12;i++) {
	        	emoji[i][3]=2;
	        }
	        for(int i=12;i<15;i++) {
	        	emoji[i][3]=1;
	        }
	        
	        //F4 
	        for (int i=0; i<5; i++) {
	        	emoji[i][4]=2;
	        }
	        for (int i=5; i<11; i++) {
	        	emoji[i][4]=1;
	        }
	        
	       emoji[4][11]=1;
	        
	        for(int i=12; i<15;i++) {
	        	emoji[i][4]=1;
	        }
	        //F5 
	        for(int i=0;i<5;i++) {
	        	emoji[i][5]=2;
	        }
	        for(int i=5;i<12;i++) {
	        	emoji[i][5]=1;
	        }
	        emoji[5][12]=2;
	        for(int i=12;i<15;i++) {
	        	emoji[i][5]=1;
	        }
	        //f6 
	        for(int i=0;i<5;i++) {
	        	emoji[i][6]=2;
	        }
	        emoji[6][6]=1;
	        for(int i=5;i<8;i++) {
	        	emoji[i][6]=2;
	        }
	        for(int i=7;i<11;i++) {
	        	emoji[i][6]=1;
	        }
	        for(int i=11;i<13;i++) {
	        	emoji[i][6]=2;
	        }
	        for(int i=13;i<15;i++) {
	        	emoji[i][6]=1;
	        }
	        //f7 
	        
	        for(int i=0;i<4;i++) {
	        	emoji[i][7]=2;
	        }
	        emoji[7][3]=1;
	        for(int i=4;i<7;i++) {
	        	emoji[i][7]=1;
	        }
	        emoji[7][7]=1;
	        emoji[7][8]=2;
	        for(int i=9;i<10;i++) {
	        	emoji[i][7]=1;
	        }
	        for(int i=10;i<12;i++) {
	        	emoji[i][7]=2;
	        }
	        emoji[7][12]=1;
	        emoji[7][13]=2;
	        emoji[7][14]=1;
	        //f8 
	        
	        for(int i=0;i<4;i++) {
	        	emoji[i][8]=2;
	        }
	        emoji[8][5]=1;
	        for(int i=5;i<8;i++) {
	        	emoji[i][7]=2;
	        }
	        for(int i=8;i<11;i++) {
	        	emoji[i][11]=1;
	        }
	        for(int i=12;i<13;i++) {
	        	emoji[i][7]=2;
	        }
	        emoji[8][14]=1;
	        //f9
	        for(int i=0;i<3;i++) {
	        	emoji[i][9]=2;
	        }
	        for(int i=3;i<5;i++) {
	        	emoji[i][9]=1;
	        }
	        for(int i=5;i<7;i++) {
	        	emoji[i][9]=2;
	        }
	        for(int i=7;i<8;i++) {
	        	emoji[i][9]=1;
	        }
	        for(int i=8;i<10;i++) {
	        	emoji[i][9]=1;
	        }
	        for(int i=10;i<12;i++) {
	        	emoji[i][9]=3;
	        }
	        for(int i=12;i<14;i++) {
	        	emoji[i][9]=2;
	        }
	        for(int i=14;i<15;i++) {
	        	emoji[i][9]=1;
	        }
	        //f10 
	        for(int i=0;i<4;i++) {
	        	emoji[i][10]=2;
	        }
	        for(int i=4;i<8;i++) {
	        	emoji[i][10]=1;
	        }
	        for(int i=8;i<13;i++) {
	        	emoji[i][10]=3;
	        }
	        for(int i=13;i<15;i++) {
	        	emoji[i][10]=1;
	        }
	        //f11 
	        
	        for(int i=0;i<4;i++) {
	        	emoji[i][11]=2;
	        }
	        for(int i=4;i<9;i++) {
	        	emoji[i][11]=1;
	        }
	        for(int i=9;i<15;i++) {
	        	emoji[i][11]=3;
	        }
	        //f12 
	        for(int i=0;i<3;i++) {
	        	emoji[i][12]=2;
	        }
	        for(int i=3;i<15;i++) {
	        	emoji[i][12]=1;
	        }
	        //f13 
	        for(int i=0;i<4;i++) {
	        	emoji[i][13]=2;
	        }
	        for(int i=4;i<13;i++) {
	        	emoji[i][13]=1;
	        }
	        for(int i=11;i<13;i++) {
	        	emoji[i][13]=2;
	        }
	        for(int i=13;i<15;i++) {
	        	emoji[i][13]=1;
	        }
	        //f14 
	        for(int i=0;i<5;i++) {
	        	emoji[i][14]=2;
	        }
	        for(int i=5;i<11;i++) {
	        	emoji[i][14]=1;
	        }
	        for(int i=11;i<14;i++) {
	        	emoji[i][14]=2;
	        }
	        emoji[14][14]=1;
	        
	      

	        // Pintar la matriz 
	        for (int j = 0; j < emoji[0].length; j++) {
	            for (int i = emoji.length - 1; i >= 0; i--) {
	                if (emoji[i][j] == 1) {
	                    System.out.print("\033[0;107m" + PIXEL); // Blanco
	                } else if (emoji[i][j] == 2) {
	                    System.out.print("\033[40m" + PIXEL); // Negro
	                } else if (emoji[i][j] == 3) {
	                    System.out.print("\033[43m" + PIXEL); // Amarillo
	                } else {
	                    System.out.print("\033[0m" + PIXEL); // Reset/Default
	                }
	            }
	            System.out.println();
	        }
	        }
}