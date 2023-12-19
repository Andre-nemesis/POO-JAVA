package Atividade_Avaliativa;
import java.util.ArrayList;

public class Classes {
	private String nome;
	private ArrayList<Arma> armas = new ArrayList<Arma>();
	private ArrayList<Classes> classes = new ArrayList<Classes>();
	
	public String getNome() {return nome;}
	
	public ArrayList<Classes> getClasses() {return classes;}
	
	public String getArmaNome() {
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
	
	public void setNome(String nome) {this.nome = nome;}
	
	public void setArma(ArrayList<Arma> arma) {this.armas=arma;}
	
	public void setClasses(Classes classe) {this.classes.add(classe);}
	
	public Classes(String nome,Arma arma) {
		this.nome=nome;
		this.armas.add(arma);
	}
	
	public Classes() {}
}
