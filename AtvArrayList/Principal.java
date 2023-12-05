package inicio.AtvArrayList;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		GerenciadorLivros gen = new GerenciadorLivros();
		int verificacao;
		do {
			System.out.println("\n-- Menu de Opções --");
			System.out.println("0 - Sair.");
			System.out.println("1 - Adicionar Livro.");
			System.out.println("2 - Remover Livro.");
			System.out.println("3 - Exibir detalhes de um Livro epecifíco.");
			System.out.println("4 - Exibir detalhes de todos os livros.");
			System.out.print("Digite sua opção: ");
			verificacao=leitura.nextInt();
			leitura.nextLine();
			
			if (verificacao==1) {
				System.out.print("Digite o ano de publicação do livro: ");
				int anopub=leitura.nextInt();
				leitura.nextLine();
				System.out.print("Digite o titulo do livro: ");
				String titulo=leitura.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor=leitura.nextLine();
				
				
				gen.addLivro(titulo, autor, anopub);
				System.out.println("\nLivro adicionado com Sucesso!");
			}
			else if (verificacao==2) {
				if(gen.isEmpyt()==true) System.out.println("\nNão há livros cadastrados!");
				else {
					System.out.print("Digite o titulo do livro para ser removido: ");
					String titulo=leitura.nextLine();
					int verificacao_rem = gen.removeLivro(titulo);
					if (verificacao_rem==1) System.out.println("\nLivro Removido com Sucesso!");
					else System.out.println("\nOcorreu um erro ao remover o livro ;(");
				}
			}
			else if (verificacao==3) {
				if(gen.isEmpyt()==true) System.out.println("\nNão há livros cadastrados!");
				else {
				System.out.print("Digite o titulo do livro para mostrar seus detalhes: ");
				String titulo=leitura.nextLine();
				gen.detalhesLivro(titulo);
				}
			}
			else if (verificacao==4) gen.listarLivros();
			else if (verificacao>=5) System.out.println("Opção inválida!");

		}while(verificacao!=0);
		leitura.close();
	}

}
