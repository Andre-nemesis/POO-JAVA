package poo.atv3;

import java.util.Scanner;

public class Carro {
	String numero_placa;
	String cor;
	int ano;
	String tipo_combustivel;
	int numero_portas;
	double quilometragem;
	String renavam;
	String chassi;
	double valor_locacao;
	Marca marca_carro = new Marca();
	Modelo modelo_carro = new Modelo();
	
	public void cadastrarCarro() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\n-- Insira as informações do Carro --");
		System.out.print("Número da Placa: ");
		this.numero_placa = leitura.nextLine();
		System.out.print("Cor: ");
		this.cor = leitura.nextLine();
		System.out.print("Tipo de Combustivel: ");
		this.tipo_combustivel = leitura.nextLine();
		System.out.print("Renavam: ");
		this.renavam = leitura.nextLine();
		System.out.print("Chassi: ");
		this.chassi = leitura.nextLine();
		System.out.print("Ano do Carro: ");
		this.ano = leitura.nextInt();
		System.out.print("Número de Portas: ");
		this.numero_portas = leitura.nextInt();
		System.out.print("Quilômetros Rodados: ");
		this.quilometragem = leitura.nextDouble();
		System.out.print("Valor da Locação: ");
		this.valor_locacao = leitura.nextDouble();
		
		
		
		marca_carro.cadastraMarca();
		modelo_carro.cadastraModelo();
		
		System.out.println("\nCarro Cadastrado com Sucesso!");
	}
	
	public void mostrarDadosCarro() {
		System.out.println("\n-- Dados do Carro --");
		marca_carro.mostrarMarca();
		modelo_carro.mostrarModelo();
		System.out.println("\nNúmero da Placa: "+this.numero_placa);
		System.out.println("Cor do Carro: "+this.cor);
		System.out.println("Ano do Carro: "+this.ano);
		System.out.println("Tipo de Combustivel: "+this.tipo_combustivel);
		System.out.println("Quantidade de Portas: "+this.numero_portas);
		System.out.println("Quilômetros Rodados: "+this.quilometragem);
		System.out.println("Renavam: "+this.renavam);
		System.out.println("Chassi: "+this.chassi);
		System.out.println("Valor de Locação: "+this.valor_locacao);
	}
}
