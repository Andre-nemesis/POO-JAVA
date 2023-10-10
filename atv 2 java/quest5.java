/*
 * Escreva um programa Java console que solicite ao usuário que informe sua idade em anos, meses e dias, ou seja, 
 * sua idade atual em anos e a quantidade de meses e dias decorridos desde seu aniversário. 
 * Seu programa deverá exibir uma saída parecida com:
    Informe sua idade em anos, meses e dias 
    Anos: 25 
    Meses: 2
    Dias: 12 
    Idade expressa em dias: 9197 
    Aqui o usuário tem 25 anos, 2 meses e 12 dias de idade. Assim, sua idade expressa em dias é 9.197

 */
import java.util.Scanner;

public class quest5 {
    public static void main(String[] args){
        int i_anos;
        int i_meses;
        int i_dias;

        int idade_dias;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua idade em anos, meses e dias");
        System.out.print("Digite sua idade em anos: ");
        i_anos = leitura.nextInt();
        System.out.print("Digite sua idade em meses: ");
        i_meses = leitura.nextInt();
        System.out.print("Digite sua idade em dias: ");
        i_dias = leitura.nextInt();
        leitura.close();

        idade_dias = (i_anos*365) + (i_meses*30) + i_dias;

        System.out.printf("Você tem %d anos, %d meses e %d dias de idade. Assim, sua idade expressa em dias é %d dias",i_anos,i_meses,i_dias,idade_dias);
    }
}
