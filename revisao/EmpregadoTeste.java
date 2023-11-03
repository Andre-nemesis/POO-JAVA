package inicio.revisao;

public class EmpregadoTeste {
	public static void main(String[] args){
		Empregado empregado1 = new Empregado();
		Empregado empregado2 = new Empregado();
		
		empregado1.cadastrarEmpregado();
		empregado2.cadastrarEmpregado();
		
		empregado1.exibirInformacoes();
		empregado1.salarioAnual();
		empregado1.aumentoSalario();
		empregado1.salarioAnual();
		
		empregado2.exibirInformacoes();
		empregado2.salarioAnual();
		empregado2.aumentoSalario();
		empregado2.salarioAnual();
	}
	
}
