package poo.atv3;

import java.util.Scanner;

public class Locacao {
	Carro carro = new Carro();
	String data_locacao;
	String horario_locacao;
	String data_devolucao;
	String horario_devolucao;
	double valor_locacao;
	String cliente;
	
	public void cadastrarDadosLocacao(Carro carro) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\n-- Insira os dados da Locação --");
		this.carro=carro;
		System.out.print("Digite a Data da Locação: ");
		this.data_locacao = leitura.nextLine();
		System.out.print("Digite o Horário de Locação: ");
		this.horario_locacao = leitura.nextLine();
		System.out.print("Digite a Data de Devolução: ");
		this.data_devolucao = leitura.nextLine();
		System.out.print("Digite o Horário de Devolução: ");
		this.horario_devolucao = leitura.nextLine();
		System.out.print("Digite o Nome do Cliente: ");
		this.cliente = leitura.nextLine();
		System.out.print("Digite o Valor da Locação: ");
		this.valor_locacao = leitura.nextDouble();
		
		leitura.close();
	}
	
	public void mostrarDadosLocacao() {
		System.out.println("\n-- Dados da Locação --");
		System.out.println("Modelo do Carro: "+this.carro.modelo_carro.descricao_modelo);
		System.out.println("Data de Locação: "+this.data_locacao);
		System.out.println("Horário de Locação: "+this.horario_locacao);
		System.out.println("Data de Devolução: "+this.data_devolucao);
		System.out.println("Horário de Devolução: "+this.horario_devolucao);
		System.out.println("Nome do Cliente: "+this.cliente);
		System.out.println("Valor da Locação: "+this.valor_locacao);
	}
}
