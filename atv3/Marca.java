package poo.atv3;

import java.util.Scanner;

public class Marca {
	String descricao_marca;
	int codigo_marca;
	
	public void cadastraMarca() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\n-- Informe as informações do Marca --");
		System.out.print("Descrição da Marca: ");
		this.descricao_marca = leitura.nextLine();
		System.out.print("Código da Marca: ");
		this.codigo_marca = leitura.nextInt();
		
		
	}
	
	public void mostrarMarca() {
		System.out.println("\n-- Dados da Marca --");
		System.out.println("Código da Marca: "+this.codigo_marca);
		System.out.println("Descrição da Marca: "+this.descricao_marca);
	}
}
