package br;

public class EXo extends ClasseAbstrata {

	@Override
	public void Desenhar(int SIZE) {
		for (int l = 1; l <= SIZE; l++){
			for (int c = SIZE; c > 0; c--){
				if (c <= l)
					System.out.print(c + " ");
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}
}
