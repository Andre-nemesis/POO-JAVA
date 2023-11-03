package inicio.revisao;
import java.util.Scanner;

public class Empregado {
	String nome;
	String sobrenome;
	double salario_mensal;
	
	public void cadastrarEmpregado() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("\n-- CADASTRANDO SEU FUNCIONÁRIO --");
		System.out.print("Digite o nome do Empregado: ");
		this.nome = leitura.nextLine();
		System.out.print("Digite o sobrenome do Empregado: ");
		this.sobrenome = leitura.nextLine();
		System.out.print("Digite o salário mensal do Empregado: ");
		this.salario_mensal = leitura.nextDouble();
		
		System.out.println("Empregado Cadastrado com Sucesso!");
	}
	
	public void exibirInformacoes() {
		System.out.println("\n\n-- Informações do Empregado --");
		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+this.sobrenome);
		System.out.println("Salário Mensal: "+this.salario_mensal);
	}
	
	public void salarioAnual() {
		System.out.printf("\nO salário anual do empregado '%s %s' é: %.2f\n",this.nome,this.sobrenome,(this.salario_mensal*12));	
	}
	
	public void aumentoSalario() {
		this.salario_mensal=this.salario_mensal+(this.salario_mensal*0.1);
	}
}
