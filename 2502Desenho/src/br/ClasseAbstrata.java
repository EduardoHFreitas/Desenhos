package br;

abstract class ClasseAbstrata implements Desenho {
	
	public void identificar(){
		System.out.println("\n\n");
		System.out.println("------------------------------------------");
		System.out.println((new Exception().getStackTrace()[3].getClassName() + ")").substring(5, 6) + ")\n");
	}
	
	
	public void DesenharAbs(int x){
		identificar();
		Desenhar(x);
	}

	public abstract void Desenhar (int SIZE);
	
}
