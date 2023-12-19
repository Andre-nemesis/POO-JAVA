package Atividade_Avaliativa;

import java.util.ArrayList;

public class Itens {
	private ArrayList<Arma> itens = new ArrayList<Arma>();
	
	public Itens() {
		criarItens();
	}
	protected void setItens(ArrayList<Arma> itens) {
		this.itens = itens;
	}
	
	public ArrayList<Arma> getItens() {
		return itens;
	}
	
	private void criarItens() {
		//Criando Armas
		//Arcos
		Arma arcoElfico = new Arma("Arco Elfico", 8, 0.5, "Recuo - Mais 0.2 de Precisao");
		Arma arcoMagmatico = new Arma("Arco Magmático", 12, 0.7, "Quemadura - Mais 2 de Dano");
		Arma arcoGeloVerdadeiro = new Arma("Arco de Gelo Verdadeiro", 17, 0.8, "None");
		//Escudos
		Arma escudoNoxiano = new Arma("Escudo Noxiano", 18, 0.35, "- 5 de força inimiga");
		Arma escudoAmazonico = new Arma("Escudo Amazônico", 12, 0.9, "+ 5 de precisao");
		Arma escudoNordico = new Arma("Escudo Nordico", 15, 0.58, "- 0.3 de precisao");
		//Livros
		Arma livroSacro = new Arma("Livro Sacro", 12, 0.78, "Mais 0.15 de precisão");
		Arma livroIncursivo = new Arma("Livro Incursivo", 15, 0.5, "Esplosão: + 5 de dano extra");
		Arma livroApocaliptico = new Arma("Livro Apocaliptico", 0, 0.001, "Caso acerte HitKill"); 
		//Varinhas
		Arma varinhaIoniania = new Arma("Varinha Ióniania", 9, 0.89, "Evenenamento 3 de Dano");
		Arma varinhaDraconica = new Arma("Varinha Dracônica", 10, 0.73, "Paralização - Menos 0.2 de Precisao");
		Arma varinhaPotteriana = new Arma("Varinha Potteriana", 16, 0.3, "Mais 10 de Dano");
		//Espadas
		Arma espadaGelida = new Arma("Espada Gélida", 10, 0.74, "Congelamento - Menos 0.1 de Precisao ao inimigo");
		Arma espadaKrugeriana = new Arma("Espada Krugeriana", 14, 0.53, "Mais 3 de Dano Permanente");
		Arma espadaNilista = new Arma("Espada Nilista", 17, 0.29, "Ataque 2 vezes");
		//Falutas
		Arma flautaAnã = new Arma("Flauta Anã", 18, 0.57, "+ 5 de dano");
		Arma flautaBarroca = new Arma("Flauta Barroca", 13, 0.85, "+ 0.1 de precisao");
		Arma flautaCharmosa = new Arma("Flauta Charmosa", 10, 1, "- 0.2 de precisao inimiga");
		
		this.itens.add(arcoElfico);
		this.itens.add(arcoMagmatico);
		this.itens.add(arcoGeloVerdadeiro);
		this.itens.add(escudoNoxiano);
		this.itens.add(escudoAmazonico);
		this.itens.add(escudoNordico);
		this.itens.add(livroSacro);
		this.itens.add(livroIncursivo);
		this.itens.add(livroApocaliptico);
		this.itens.add(varinhaIoniania);
		this.itens.add(varinhaDraconica);
		this.itens.add(varinhaPotteriana);
		this.itens.add(espadaGelida);
		this.itens.add(espadaKrugeriana);
		this.itens.add(espadaNilista);
		this.itens.add(flautaAnã);
		this.itens.add(flautaBarroca);
		this.itens.add(flautaCharmosa);
		
	}
}
