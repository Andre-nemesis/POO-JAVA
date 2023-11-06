package poo.atv3;
import java.util.Scanner;

public class Modelo {
	String descricao_modelo;
	int codigo_modelo;
	
	public void cadastraModelo() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\n-- Informe as informações do Modelo --");
		System.out.print("Descrição do Modelo: ");
		this.descricao_modelo = leitura.nextLine();
		System.out.print("Código do Modelo: ");
		this.codigo_modelo = leitura.nextInt();
		
	}
	
	public void mostrarModelo() {
		System.out.println("\n-- Dados da Modelo --");
		System.out.println("Código da Modelo: "+this.codigo_modelo);
		System.out.println("Descrição da Modelo: "+this.descricao_modelo);
	}
}
