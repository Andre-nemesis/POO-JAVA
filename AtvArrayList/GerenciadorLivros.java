package inicio.AtvArrayList;

import java.util.ArrayList;

public class GerenciadorLivros {
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public boolean isEmpyt() {
		return this.livros.isEmpty();
	}
	
	public void addLivro(String titulo,String autor,int anopubli) {
		Livro liv = new Livro();
		liv.setTitulo(titulo);
		liv.setAutor(autor);
		liv.setAnoPublicacao(anopubli);
		this.livros.add(liv);	
	}
	
	public int removeLivro(String titulo_livro) {
		if (isEmpyt()==true) return 0;
		else {
			for (Livro livro : livros) {
				if(livro.getTitulo().equals(titulo_livro)) {
					this.livros.remove(livro);
					return 1;
				}
			}
		}
		return 0;
	}
	
	public int detalhesLivro(String titulo_livro) {
		if (isEmpyt()==true) return 0;
		else{
			for (Livro livro : livros) {
				if (livro.getTitulo().equals(titulo_livro)) {
					System.out.println("\nTitulo: "+livro.getTitulo());
					System.out.println("Autor: "+livro.getAutor());
					System.out.println("Ano de Publicação: "+livro.getAnoPublicacao());
					return 1;
				}
			}
		}
		return 0;
	}
	
	public void listarLivros() {
		if (isEmpyt()==true) System.out.println("\nNão há livros cadastrados!");
		else {
			for (Livro livro : livros) { 
				System.out.println("\nTitulo: "+livro.getTitulo());
				System.out.println("Autor: "+livro.getAutor());
				System.out.println("Ano de Publicação: "+livro.getAnoPublicacao());	
			}
		}
	}
}
