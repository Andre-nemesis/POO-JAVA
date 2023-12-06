package AulaRevisao;

public class Livro {
	private String titulo;
	private String autor;
	private int ano_publicacao;
	private String status;
	private int id;
	
	private void setTitulo(String tit) {this.titulo=tit;}
	private void setAutor(String aut) {this.autor=aut;}
	private void setAnoPublicacao(int ano) {this.ano_publicacao=ano;}
	private void setId(int id) {this.id=id;}
	public void setStatus(String stat) {this.status=stat;}
	
	public String getTitulo() {return this.titulo;}
	public String getAutor() {return this.autor;}
	public int getAnoPublicacao() {return this.ano_publicacao;}
	public String getStatus() {return this.status;}
	public int getId() {return this.id;}
	
	public void infoLivro() {
		System.out.println("\nInformações do Livro:\n");
		System.out.println("Título: " + this.titulo);
		System.out.println("ID: " + this.id);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de Publicação: " + this.ano_publicacao);
		System.out.println("Status: " + this.status);
	}
	
	public void cadastrarLivro(String tit,String aut,int ano,String stat,int id) {
		setTitulo(tit);
		setAutor(aut);
		setAnoPublicacao(ano);
		setStatus(stat);
		setId(id);
	}
}
