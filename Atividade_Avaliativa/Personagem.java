package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Personagem {
	
	private String Nome;
	private int vida;
	private Raca raca;
	private Classes classe;
	
	// construtores
	public Personagem(String nome,int vida,Classes classe, Raca raca) {
		this.Nome=nome;
		this.vida=vida;
		this.classe=classe;
		this.raca=raca;
	}
	
	public Personagem() {
		
	}

	//Seters
	public void setNome(String nome) {Nome = nome;}
	public void setVida(int vida) {this.vida = vida;}
	public void setClasse(Classes classe) {this.classe = classe;}	
	public void setRaca(Raca raca) {this.raca = raca;}
	
	//getters
	public String getNome() {return Nome;}
	public int getVida() {return vida;}
	public Classes getClasse() {
		return this.classe;
		}
	public String getRaca() {return raca.getNome_da_raca();}
	
	// função para ver as informações do personagem
	public void mostrarPersonagem() {
		System.out.println(Cor.PRETO_BACKGORUND.getCodigo()+"----------------------"+Cor.BRANCO.getCodigo());
		System.out.println(Cor.AMARELO_SUBLINHADO.getCodigo()+"Nome: "+Cor.CIANO_SUBLINHADO.getCodigo()+this.Nome+Cor.BRANCO.getCodigo());
		System.out.println(Cor.AMARELO_SUBLINHADO.getCodigo()+"Vida: "+Cor.CIANO_SUBLINHADO.getCodigo()+this.vida+Cor.BRANCO.getCodigo());
		System.out.println(Cor.AMARELO_SUBLINHADO.getCodigo()+"Raça: "+Cor.CIANO_SUBLINHADO.getCodigo()+raca.getNome_da_raca()+Cor.BRANCO.getCodigo());
		System.out.println(Cor.AMARELO_SUBLINHADO.getCodigo()+"Classe: "+Cor.CIANO_SUBLINHADO.getCodigo()+this.classe.getNome()+Cor.BRANCO.getCodigo());
		System.out.println(Cor.AMARELO_SUBLINHADO.getCodigo()+"Armas: "+Cor.CIANO_SUBLINHADO.getCodigo()+this.classe.getArmaNome()+Cor.BRANCO.getCodigo());
		System.out.println(Cor.PRETO_BACKGORUND.getCodigo()+"----------------------"+Cor.BRANCO.getCodigo());
	}
}
