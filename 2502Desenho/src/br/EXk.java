package br;

public class EXk extends ClasseAbstrata {

	@Override
	public void Desenhar(int SIZE) {
	       
		for (int l = SIZE; l > 0; l--){
    	   for (int c = 0; c <= SIZE * 2; c++){
  			   if (c >= l && (c <= ((SIZE * 2) - l)))
  				   System.out.print("# ");
  			   else {
  				   System.out.print("  ");
  			   }
    	   }
    	   System.out.println("");
       }
	}
}
