package br;

public class EXb extends ClasseAbstrata {

	@Override
	public void Desenhar(int SIZE) {
       for (int l = 0; l < SIZE; l++){
    	   for (int c = SIZE; c > l; c--){
    		   System.out.print("#");
    	   }
    	   System.out.println("");
       }
	}
}
