package poo.atv3;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	public void abre() {
		this.aberta=true;
	}
	
	public void fecha() {
		this.aberta=false;
	}
	
	public void pinta(String cor) {
		if (this.cor == null) {
			this.cor=cor;
			System.out.println("A cor da porta é: "+this.cor);
		}
		else {
			System.out.println("A Antiga cor da porta é: "+this.cor);
			this.cor=cor;
			System.out.println("A Nova cor da porta é: "+this.cor);
		}		
		
	}
	
	public void estarAberta() {
		if (this.aberta) System.out.println("Está aberta");
		else System.out.println("Está fechada");
	}
	
	public void dimensoes() {
		System.out.printf("As dimensões da porta são |X: %.2f | Y: %.2f | Z: %.2f|",this.dimensaoX,this.dimensaoY,this.dimensaoZ);
	}
}
