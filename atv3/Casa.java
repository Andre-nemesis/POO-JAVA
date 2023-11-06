package poo.atv3;

public class Casa {
	String cor_casa;
	Porta p1 = new Porta();
	Porta p2 = new Porta();
	Porta p3 = new Porta();
	
	public void pintarCasa(String cor) {
		if (this.cor_casa==null) {
			this.cor_casa=cor;
			System.out.println("A cor da casa é: "+this.cor_casa);
		}
		else {
			System.out.println("A Antiga cor da casa é: "+this.cor_casa);
			this.cor_casa=cor;
			System.out.println("A Nova cor da casa é: "+this.cor_casa);
		}
	}
	
	public void abrirPorta(int porta) {
		if (porta==1) {
			this.p1.abre();
			System.out.println("Porta 1 foi aberta");
		}
		else if (porta==2) {
			this.p2.abre();
			System.out.println("Porta 2 foi aberta");
		}
		else if (porta==3) {
			this.p3.abre();
			System.out.println("Porta 3 foi aberta");
		}
		else System.out.println("Não existe essa porta!");
	}
	
	public void fecharPorta(int porta) {
		if (porta==1) {
			this.p1.fecha();
			System.out.println("Porta 1 foi fechada");
		}
		else if (porta==2) {
			this.p2.fecha();
			System.out.println("Porta 2 foi fechada");
		}
		else if (porta==3) {
			this.p3.fecha();
			System.out.println("Porta 3 foi fechada");
		}
		else System.out.println("Não existe essa porta!");
	}
	
	public int quantasPortasEstaoAbertas() {
		if (this.p1.aberta==true||this.p2.aberta==true||this.p3.aberta==true) {
			
			if((this.p1.aberta==true&&this.p2.aberta==true)||
				(this.p1.aberta==true&&this.p3.aberta==true)||
				(this.p2.aberta==true&&this.p3.aberta==true)) {
				
				if (this.p1.aberta==true&&this.p2.aberta==true&&this.p3.aberta==true) return 3;
				
				return 2;
			}			
			
			return 1;
		}
		
		else return 0;
		
	}
	
}

