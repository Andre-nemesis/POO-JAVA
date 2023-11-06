package poo.atv3;

import java.util.Scanner;

public class Endereco {
	String rua;
	String bairro;
	String cidade;
	int numero;
	
	public void cadastrarDados() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("\n-- Digite os Dados de Endereço do Cliente --");
		System.out.print("Digite o nome da Cidade: ");
		this.cidade = leitura.nextLine();
		System.out.print("Digite o nome do Bairro: ");
		this.bairro = leitura.nextLine();
		System.out.print("Digite o nome da Rua: ");
		this.rua = leitura.nextLine();
		System.out.print("Digite o número da Casa: ");
		this.numero = leitura.nextInt();
		
	}
	
	public void mostrarEndereco() {
		System.out.println("\n-- Endereço --");
		System.out.println("Número da Casa: "+this.numero);
		System.out.println("Rua: "+this.rua);
		System.out.println("Bairro: "+this.bairro);
		System.out.println("Cidade: "+this.cidade);
	}
}
