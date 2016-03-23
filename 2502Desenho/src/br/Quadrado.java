package br;

public class Quadrado implements Desenho {
	
	public static int t = 10;
	
		
	public void Desenhar (int SIZE) {
		for (int i = 0; i < SIZE; i++){
			if (i == 0)
				for (int a = 0; a < SIZE; a++)
				    System.out.print("*");
			else if (i == SIZE - 1) {
			    System.out.println("");
				for (int a = 0; a < SIZE; a++)
					System.out.print("*");
			}
			else
				for(int b = 0; b < SIZE; b++){
					if (b == 0)
          			    System.out.print("\n*");
					else
						if(b == SIZE - 1)
							System.out.print("*");						
						else 
							System.out.print(" ");
				}
		}
	}
}
