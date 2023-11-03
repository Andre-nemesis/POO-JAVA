package inicio.revisao;
import java.util.Scanner;

public class Data {
	int mes;
	int dia;
	int ano;
	
	public void cadastrarData() {
		Scanner leitura = new Scanner(System.in);
		int dia;
		int mes;
		System.out.print("Digite o dia: ");
		dia = leitura.nextInt();
		if (dia >31||dia<1) {
			do {
				System.out.println("Valor inválido para dia!");
				System.out.print("Digite outro valor: ");
				dia = leitura.nextInt();
				System.out.println("");
			}while(dia >31||dia<1);
		}
		this.dia=dia;
		System.out.print("Digite o mês: ");
		mes = leitura.nextInt();
		if (mes >12||mes<1) {
			do {
				System.out.println("Valor inválido para mês!");
				System.out.print("Digite outro valor: ");
				mes = leitura.nextInt();
				System.out.println("");
			}while(mes >12||mes<1);
		}
		this.mes=mes;
		System.out.print("Digite o ano: ");
		this.ano = leitura.nextInt();
	
	}
	public void displayData() {
		if (mes<=9)System.out.printf("\n%d/0%d/%d",this.dia,this.mes,this.ano);
		else System.out.printf("\n%d/%d/%d",this.dia,this.mes,this.ano);
	}
	public void displayDataExtenso() {
		if (this.mes == 1) System.out.printf("\n%d de janeiro de %d",this.dia,this.ano);
		else if (this.mes == 1) System.out.printf("\n%d de fevereiro de %d",this.dia,this.ano);
		else if (this.mes == 3) System.out.printf("\n%d de março de %d",this.dia,this.ano);
		else if (this.mes == 4) System.out.printf("\n%d de abril de %d",this.dia,this.ano);
		else if (this.mes == 5) System.out.printf("\n%d de maio de %d",this.dia,this.ano);
		else if (this.mes == 6) System.out.printf("\n%d de junho de %d",this.dia,this.ano);
		else if (this.mes == 7) System.out.printf("\n%d de julho de %d",this.dia,this.ano);
		else if (this.mes == 8) System.out.printf("\n%d de agosto de %d",this.dia,this.ano);
		else if (this.mes == 9) System.out.printf("\n%d de setembro de %d",this.dia,this.ano);
		else if (this.mes == 10) System.out.printf("\n%d de outubro de %d",this.dia,this.ano);
		else if (this.mes == 11) System.out.printf("\n%d de novembro de %d",this.dia,this.ano);
		else if (this.mes == 12) System.out.printf("\n%d de dezembro de %d",this.dia,this.ano);
	}
}
