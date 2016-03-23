package br;

public class EXd extends ClasseAbstrata {

	@Override
	public void Desenhar(int SIZE) {
       for (int l = SIZE; l > 0; l--){
    	   for (int c = 0; c <= SIZE; c++){
  			   if (c < l)
  				   System.out.print(" ");
  			   else
  				   System.out.print("#");
    	   }
    	   System.out.println("");
       }
	}
}
