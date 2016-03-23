package br;

public class EXa extends ClasseAbstrata {

	@Override
	public void Desenhar(int SIZE) {
       for (int l = 0; l < SIZE; l++){
    	   for (int c = 0; c <= l; c++){
    		   System.out.print("#");
    	   }
    	   System.out.println("");
       }
	}
}
