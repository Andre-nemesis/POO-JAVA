package Atividade_Avaliativa;

import java.util.ArrayList;
public class Raca {
	private String nome_da_raca;
	// ArrayList necessário para mostrar os personagens no menu do jogo
	private ArrayList<Raca> racas = new ArrayList<Raca>();
	
	// construtores
	public Raca(String nome) {
		this.nome_da_raca=nome;
	}
	
	public Raca() {
		
	}
	
	// setters
	public void setNome_da_raca(String nome_da_raca) {
		this.nome_da_raca = nome_da_raca;
	}
	
	public void setRacas(Raca raca) {
		this.racas.add(raca);
	}
	
	// getters
	public String getNome_da_raca() {
		return nome_da_raca;
	}
	public ArrayList<Raca> getRacas() {
		return racas;
	}
}
