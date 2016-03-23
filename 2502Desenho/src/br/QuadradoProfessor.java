package br;

public class QuadradoProfessor implements Desenho {

	@Override
	public void Desenhar (int SIZE) {
		for (int i = 0; i < SIZE; i++){
			for (int c = 0; c < SIZE; c++){
				if (i == 0 || i == SIZE - 1)
					System.out.print("#");
				else
				if (c == 0 || c == SIZE - 1)
    				System.out.print("#");						
	    		else 
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
