package inicio.AtvArrayList;

public class Livro {
	private String titulo;
	private String autor;
	private int ano_publicacao;
	
	public void setTitulo(String tit) {this.titulo=tit;}
	public void setAutor(String aut) {this.autor=aut;}
	public void setAnoPublicacao(int ano) {this.ano_publicacao=ano;}
	
	public String getTitulo() {return this.titulo;}
	public String getAutor() {return this.autor;}
	public int getAnoPublicacao() {return this.ano_publicacao;}
}
