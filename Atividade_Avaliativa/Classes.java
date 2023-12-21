package Atividade_Avaliativa;
import java.util.ArrayList;

public class Classes {
	private String nome;
	private ArrayList<Arma> armas = new ArrayList<Arma>(); // necessário para guardar as duas armas de cada personagem
	private ArrayList<Classes> classes = new ArrayList<Classes>(); // necessário para mostrar as classes no menu, não é utilizados nas subclasses
	
	//geters
	public String getNome() {return nome;}
	
	public ArrayList<Classes> getClasses() {return classes;}
	
	public String getArmaNome() {
		// adicionando os nomes à uma string vázia para retornar os dois nomes
		String nome_das_armas = "";
		
		if (this.armas.size()==1) return this.armas.get(0).getNome();
		
		else {
			for (Arma arma : armas) {
				nome_das_armas += arma.getNome() +", ";
			}
			return nome_das_armas;
		}
	}
	
	public ArrayList<Arma> getArma(){
		return this.armas;
	}
	
	//seters
	public void setNome(String nome) {this.nome = nome;}
	
	public void setArma(ArrayList<Arma> arma) {this.armas=arma;}
	
	public void setClasses(Classes classe) {this.classes.add(classe);}
	
	// construtores
	public Classes(String nome,Arma arma) {
		this.nome=nome;
		this.armas.add(arma);
	}
	
	public Classes() {
		
	}
	
	// efeito especial de cada classe, será modificado as cores de cada classe para estilização
	public void efeitoEspecial(Arma arma) {
		
	}
}
