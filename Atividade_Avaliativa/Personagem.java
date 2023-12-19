package Atividade_Avaliativa;

public class Personagem {
	public enum Cor {
	    PRETO("\u001B[0;30m"),VERMELHO("\u001B[0;31m"),VERDE("\u001B[0;32m"),
	    AMARELO("\u001B[0;33m"),AZUL("\u001B[0;34m"),ROXO("\u001B[0;35m"),
	    CIANO("\u001B[0;36m"),BRANCO("\u001B[0;37m"),PRETO_SUBLINHADO("\u001B[4;30m"),
		VERMELHO_SUBLINHADO("\u001B[4;31m"),VERDE_SUBLINHADO("\u001B[4;32m"),
	    AMARELO_SUBLINHADO("\u001B[4;33m"),AZUL_SUBLINHADO("\u001B[4;34m"),ROXO_SUBLINHADO("\u001B[4;35m"),
	    CIANO_SUBLINHADO("\u001B[4;36m"),BRANCO_SUBLINHADO("\u001B[4;37m"),PRETO_BACKGORUND("\u001B[40m"),
		VERMELHO_BACKGORUND("\u001B[41m"),VERDE_BACKGROUND("\u001B[42m"),AMARELO_BACKGROUND("\u001B[43m"),
	    AZUL_BACKGROUND("\u001B[44m"),ROXO_BACKGROUND("\u001B[45m"),CIANO_BACKGROUND("\u001B[46m"),
	    BRANCO_BACKGROUND("\u001B[47m");

	    private String codigo;

	    Cor(String codigo) {
	        this.codigo = codigo;
	    }

	    public String getCodigo() {
	        return codigo;
	    }
	}
	
	private String Nome;
	private int vida;
	private Raca raca;
	private Classes classe;
	
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
