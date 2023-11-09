package poo.array;

public class Principal {
	public static void main(String[] args) {
		/* Primeira Questão
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Empresa em = new Empresa();
		boolean sit_func;
		
		f1.func("André", "92384234", "12/12/2004", "88918832", 6122.21, "Estagio", "Rua");
		f2.func("Jot", "7234234", "12/43/2021", "8823772", 12312.32, "Tecnico", "Prado");
		f3.func("Nick", "83223", "21/02/2003", "832832", 1231.21, "Dono", "Prado");
		em.adicionarEmpresa("Jeferson Caminhões", "19293191-21", "Icó", "CE");
		em.adcionarFuncionario(f1);
		em.adcionarFuncionario(f2);
		em.adcionarFuncionario(f3);
		sit_func = em.verificarFuncionario(f3);
		
		if (sit_func) System.out.println("O Funcionário está na empresa");
		else System.out.println("O Funcionário não está na empresa");
		
		em.imprimirFuncionario();
		*/
		
		/*Segunda Questão
		int[] array;
		int[] array2;
		int maior_1;
		int qtd_pares_1;
		int maior_2;
		int qtd_pares_2;
		int qtd_iguais;
		ComparacaoDeValores comp = new ComparacaoDeValores();
		array = comp.criarArray();
		array2 = comp.criarArray();
		maior_1 = comp.maiorValor(array);
		qtd_pares_1 = comp.totalPares(array);
		maior_2 = comp.maiorValor(array2);
		qtd_pares_2 = comp.totalPares(array2);
		qtd_iguais = comp.totalIguais(array, array2);
		
		System.out.print("\nPrimeiro array: [");
		for (int i : array) System.out.printf(" %d,",i);
		System.out.print("]");
		
		System.out.print("\nSegundo array: [");
		for (int i : array2) System.out.printf(" %d,",i);
		System.out.print("]");
		
		System.out.printf("\nmaior valor array 1: %d\tQuantidade de Pares array 1: %d\tQuantidade de números iguais nos arrays 1: %d",maior_1,qtd_pares_1,qtd_iguais);
		System.out.printf("\nmaior valor array 2: %d\tQuantidade de Pares array 2: %d\tQuantidade de números iguais nos arrays 1: %d",maior_2,qtd_pares_2,qtd_iguais);
		*/
		
		/* Terceira Questão
		int[] arrayA;
		int[] arrayB;
		int[] arrayC;
		ComparacaoDeValores comp = new ComparacaoDeValores();
		arrayA=comp.criarArray();
		arrayB=comp.criarArray();
		arrayC=comp.multiplicarArrays(arrayA, arrayB);
		
		System.out.print("\nPrimeiro array: [");
		for (int i : arrayA) System.out.printf(" %d,",i);
		System.out.print("]");
		
		System.out.print("\nSegundo array: [");
		for (int i : arrayB) System.out.printf(" %d,",i);
		System.out.print("]");
		
		System.out.print("\nArray da Multiplicação dos arrays: [");
		for (int i : arrayC) System.out.printf(" %d,",i);
		System.out.print("]");
		*/
	}
}
