package br;

public class EXs extends ClasseAbstrata {

	@Override
	public void Desenhar(int SIZE) {
		for (int l = 1; l <= SIZE; l++){
			int x = 0;
			for (int c = 1; c < SIZE * 2; c++){
				if (c <= l || c > SIZE * 2 - l - 1)
					if (c <= SIZE)
						System.out.print(++x + " ");
					else {
						if (x == SIZE) x--; 
						System.out.print(x-- + " ");
					}
				else
					System.out.print("  ");
			}
			System.out.println("");
		}

	}

}
