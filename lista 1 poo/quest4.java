import java.util.Scanner;

public class quest4 {
    public static void main(String[] args){
        //Elabore um código que ao informar um número, imprima se este número é primo.
        Scanner leitura = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor para verificar se ele é primo: ");
        valor = leitura.nextInt();
        leitura.close();

        if (valor%valor==1&&valor%1==0&&valor%valor==1) System.out.printf("%d É um número Primo",valor);
        else System.out.printf("%d Não é um número primo",valor);
    }
}
