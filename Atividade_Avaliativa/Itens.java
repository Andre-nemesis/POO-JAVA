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
		Arma arcoElfico = new Arma("Arco Elfico", 13, 0.5, "Recuo do Ataque inimigo");
		Arma arcoMagmatico = new Arma("Arco Magmático", 16, 0.7, "Inimigo queimado");
		Arma arcoGeloVerdadeiro = new Arma("Arco de Gelo Verdadeiro", 19, 0.8, "Inimigo Congelado");
		//Escudos
		Arma escudoNoxiano = new Arma("Escudo Noxiano", 18, 0.35, "Desestabilizou o inimigo");
		Arma escudoAmazonico = new Arma("Escudo Amazônico", 12, 0.9, "Reflorestou o ambiente");
		Arma escudoNordico = new Arma("Escudo Nordico", 15, 0.58, "A história vinking foi restauradas");
		//Livros
		Arma livroSacro = new Arma("Livro Sacro", 12, 0.78, "Conversão do inimigo iniciada!");
		Arma livroIncursivo = new Arma("Livro Incursivo", 15, 0.5, "Incursão iniciada!");
		Arma livroApocaliptico = new Arma("Livro Apocaliptico", 24, 0.001, "Bem-vindo ao apocalipse!"); 
		//Varinhas
		Arma varinhaIoniania = new Arma("Varinha Ióniania", 13, 0.89, "O inimigo está mais pácifico!");
		Arma varinhaDraconica = new Arma("Varinha Dracônica", 16, 0.73, "O inimigo tomou um pequeno choque!");
		Arma varinhaPotteriana = new Arma("Varinha Potteriana", 18, 0.3, "O inimigo foi evenenado!");
		//Espadas
		Arma espadaGelida = new Arma("Espada Gélida", 12, 0.74, "Parte do alvo foi congelado!");
		Arma espadaKrugeriana = new Arma("Espada Krugeriana", 14, 0.53, "Um kruger te ajudou na rodada!");
		Arma espadaNilista = new Arma("Espada Nilista", 17, 0.29, "Nietzsche negou a existência do sentido!");
		//Falutas
		Arma flautaAnã = new Arma("Flauta Anã", 18, 0.57, "Alvo dança sem parar!");
		Arma flautaBarroca = new Arma("Flauta Barroca", 15, 0.85, "Aleijadinho esculpiu mais uma obra!");
		Arma flautaCharmosa = new Arma("Flauta Charmosa", 13, 1, "Parece que o alvo gosta de você");
		
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
