package poo.array;
import java.util.Scanner;

public class ComparacaoDeValores {
	public int[] criarArray() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("-- Criando seu Array de números inteiros --");

		int qtd_valores;
		System.out.print("Digite quantos valores você vai querer no array: ");
		qtd_valores=leitura.nextInt();
		int[] array = new int[qtd_valores];
			
		for (int i=0;i<qtd_valores;i++) {
			int valor;
			System.out.printf("Digite o %d° valor do array: ",(i+1));
			valor = leitura.nextInt();
			array[i]=valor;
		}
			
		return array;
	}
	
	public int totalPares(int[] array) {
		int par=0;
		for (int i : array) if (i%2==0) par++;
		return par;
	}
	
	public int maiorValor(int[] array) {
		int maior_numero=0;
		for (int i : array) if(i>maior_numero) maior_numero=i;
		return maior_numero;
	}
	
	public int totalIguais(int[] array1,int[] array2) {
		int total_iguais=0;
		for (int i : array1) for(int d:array2) if(i==d) total_iguais++;
		return total_iguais;
	}
	public int[] multiplicarArrays(int[] array1,int[] array2) {
		int[] arrayC = new int[array1.length];
		for (int i=0;i<array1.length;i++) {
			arrayC[i]=array1[i]*array2[i];
		}
		return arrayC;
	}
}
