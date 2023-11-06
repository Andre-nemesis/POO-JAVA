package poo.atv3;

public class Principal {

	public static void main(String[] args) {
		//1° questão
		
		//Programa 1
		/*
		Funcionario f1 = new Funcionario();
		Departamento d1 = new Departamento();
		
		d1.cadastrarDepartamento(121, "Informática");
		f1.cadastrarFuncionario("Francisco José", 3500, "15-08-2023", "2001058796", d1);
		
		f1.situacaoFuncionario();
		f1.imprimirFuncionario();
		f1.bonifica(1500);
		f1.imprimirFuncionario();
		f1.demitir();
		f1.situacaoFuncionario();
		*/
		
		//Programa 2
		/*
		Pessoa p = new Pessoa();
		
		p.inserirDados("André", 18);
		p.imprimirIdade();
		p.fazAniversario(1);
		p.imprimirIdade();
		p.fazAniversario(1);
		p.imprimirIdade();
		p.fazAniversario(1);
		p.imprimirIdade();
		*/
		
		//Programa 3
		/*
		Porta porta = new Porta();
		porta.dimensaoX = 4.6;
		porta.dimensaoY = 2.6;
		porta.dimensaoZ = 1.6;
		porta.pinta("Vermelha");
		porta.abre();
		porta.estarAberta();
		porta.fecha();
		porta.estarAberta();
		porta.pinta("Verde");
		porta.dimensoes();
		*/
		
		//Questão 2
		//Programa 1
		/*
		Casa casa = new Casa();
		casa.pintarCasa("Azul");
		casa.abrirPorta(2);
		casa.abrirPorta(1);
		casa.abrirPorta(3);
		casa.fecharPorta(2);
		int porta = casa.quantasPortasEstaoAbertas();
		System.out.println("Portas abertas: "+porta);
		*/
		
		//Programa 2
		/*
		Clientes cliente = new Clientes();
		Carro carro = new Carro();
		Locacao locacao = new Locacao();
		
		cliente.cadastrarCliente();
		carro.cadastrarCarro();
		locacao.cadastrarDadosLocacao(carro);
		
		cliente.dadosCliente();
		carro.mostrarDadosCarro();
		locacao.mostrarDadosLocacao();
		*/
	}

}
