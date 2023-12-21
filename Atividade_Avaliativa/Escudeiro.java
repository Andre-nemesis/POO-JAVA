package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Escudeiro extends Classes{
	// herança da classe Classes
	
	// constutores
	public Escudeiro() {
		super("Escudeiro",null);
	}
	
	public Escudeiro(Arma arma) {
		super("Escudeiro",arma);
	}
	// polimorfismo da função efeitoEspecial na classe Classes, alterando as cores dos efeitos especiais das armas
	@Override
	public void efeitoEspecial(Arma arma) {
		System.out.println("\n"+Cor.VERDE.getCodigo()+arma.getEfeito_Especial()+Cor.BRANCO.getCodigo());
	}
}
