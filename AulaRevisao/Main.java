package AulaRevisao;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		Livro l3 = new Livro();
		
		Usuario usu1 = new Usuario();
		
		Biblioteca bib1 = new Biblioteca();
		
		l1.cadastrarLivro("GOT", "George R. Martin", 2000, "Livre", 123);
		l2.cadastrarLivro("Alice Maravilhas", "Duda", 1982, "Livre", 456);
		l3.cadastrarLivro("A história de Duda", "Nickolas", 2021, "Livre", 789);
		
		l1.infoLivro();
		l2.infoLivro();
		l3.infoLivro();
		
		usu1.setIdUsuario(12);
		usu1.setNomeUsuario("Antonio");
		
		bib1.cadastrarLivro(l1);
		bib1.cadastrarLivro(l2);
		bib1.cadastrarLivro(l3);
		bib1.livrosCadastrados();
		bib1.emprestimo(usu1, l1);
		l1.infoLivro();
		bib1.emprestimo(usu1, l2);
		l2.infoLivro();
		usu1.infoUsuario();
		bib1.devolucao(usu1, l1);
		l1.infoLivro();
	}

}
