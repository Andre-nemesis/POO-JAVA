package poo.array;
import java.util.Scanner;

public class Funcionario {
	String nome;
	String cpf;
	String data_nasc;
	String telefone;
	double salario;
	String cargo;
	String endereco;
	
	public void cadastrarFuncionario() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("-- Cadastrando Funcionário --");
		System.out.print("Digite o nome do Funcionário: ");
		this.nome=leitura.nextLine();
		System.out.print("\nDigite o cpf do Funcionário: ");
		this.cpf=leitura.nextLine();
		System.out.print("\nDigite a Data de Nacimento do Funcionário: ");
		this.data_nasc=leitura.nextLine();
		System.out.print("\nDigite o Telefone do Funcionário: ");
		this.telefone=leitura.nextLine();
		System.out.print("\nDigite o Cargo do Funcionário: ");
		this.cargo=leitura.nextLine();
		System.out.print("\nDigite o Endereço do Funcionário: ");
		this.endereco=leitura.nextLine();
		System.out.print("\nDigite o Salário do Funcionário: ");
		this.salario=leitura.nextDouble();	
	}
	public void func(String n,String cpf,String data,String telefone,double sal,String car,String end) {
		this.nome=n;
		this.cpf=cpf;
		this.data_nasc=data;
		this.telefone=telefone;
		this.salario=sal;
		this.cargo=car;
		this.endereco=end;
	}
}
