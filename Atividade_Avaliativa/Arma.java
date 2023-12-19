package Atividade_Avaliativa;

public class Arma {
	private String Nome;
	private int Forca;
	private double Precisao;
	private String Efeito_Especial;
	
	//Metodo Constutor
	public Arma(String nome,int forca,double precisao,String esp_efect) {
		this.Nome=nome;
		this.Forca=forca;
		this.Precisao=precisao;
		this.Efeito_Especial=esp_efect;
	}
	
	public Arma() {
		
	}
	
	//geters
	public String getNome() {return Nome;}
	
	public int getForca() {return Forca;}
	
	public double getPrecisao() {return Precisao;}
	
	public String getEfeito_Especial() {return Efeito_Especial;}

	//Seters
	public void setNome(String nome) {Nome = nome;}

	public void setForca(int forca) {Forca = forca;}

	public void setPrecisao(int precisao) {Precisao = precisao;}
	
	public void setEfeito_Especial(String efeito_Especial) {Efeito_Especial = efeito_Especial;}
	
}
