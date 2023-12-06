package AulaRevisao;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public void cadastrarLivro(Livro livro) {this.livros.add(livro);}
	
	public void removerLivro(Livro livro) {
		if(this.livros.equals(livro)) System.out.println("Livro Removido com Sucesso!");
		else System.out.println("Livro não Encontrado!");
	}
	
	public void livrosCadastrados() {
		System.out.println("\n-- Livros Cadastrados na Biblioteca --");
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}
	}
	
	public void emprestimo(Usuario usu,Livro liv) {
		liv.setStatus("Emprestado");
		usu.emprestarLivro(liv);
		System.out.println("\n-> Livro "+ liv.getTitulo() + " emprestado à "+usu.getNomeUsuario());
	}
	public void devolucao(Usuario usu,Livro liv) {
		liv.setStatus("Livre");
		usu.devolverLivro(liv);
		System.out.println("\n\n-> Livro "+ liv.getTitulo() + " devolvido à Biblioteca");
	}
	
	public void mostrarLivros() {
		System.out.println("Livros Cadastrados na Biblioteca");
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}
	}
}
