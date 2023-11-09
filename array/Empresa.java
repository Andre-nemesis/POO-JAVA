package poo.array;
import java.util.ArrayList;

public class Empresa {
	String nome;
	String cnpj;
	String cidade;
	String UF;
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void adcionarFuncionario(Funcionario f) {this.funcionarios.add(f);}
	
	public boolean verificarFuncionario(Funcionario f) {
		for(Funcionario x:this.funcionarios) if(f.cpf==x.cpf) return true;
		return false;
	}
	
	public void imprimirFuncionario() {
		for (Funcionario f :this.funcionarios) System.out.printf("%s -> %.2f\n",f.nome,f.salario);
	}
	
	public void adicionarEmpresa(String n,String cnpjoto,String city,String Uf) {
		this.nome=n;
		this.cnpj=cnpjoto;
		this.cidade=city;
		this.UF=Uf;
	}

}