package poo.atv3;

import java.util.Scanner;
public class Clientes {
	String nome;
	String cpf;
	String numero;
	Endereco endereco = new Endereco();
	
	public void cadastrarCliente() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("-- Digite o dados do Cliente --");
		System.out.print("Digite o Nome do cliente: ");
		this.nome = leitura.nextLine();
		System.out.print("Digite o CPF do cliente: ");
		this.cpf = leitura.nextLine();
		System.out.print("Digite o Número do cliente: ");
		this.numero = leitura.nextLine();
		
		endereco.cadastrarDados();
		
		System.out.println("\nCliente Cadastrado com sucesso!");
	}
	
	public void dadosCliente() {
		System.out.println("\n-- Dados do Cliente "+this.nome+" --");
		System.out.println("CPF: "+this.cpf);
		System.out.println("Número de Contato: "+this.numero);
		endereco.mostrarEndereco();
	}
}
