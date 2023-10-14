/*
 Escreva um programa Java console que leia um número de 3 dígitos e o inverta, 
 escrevendo o número lido e o invertido. Por exemplo, se o usuário informar o valor 753, 
 seu programa deverá invertê-lo, resultando em 357. Seu programa deverá exibir a seguinte saída: 
    Informe um valor inteiro de três dígitos: 753 
    O valor original é: 753
    O valor invertido é: 357 

 */

import java.util.Scanner;

public class quest9{

    private int reverse(String valor_inserido){
        String reverse_value = "";
        int reverse_value_int;
        for (int i = valor_inserido.length()-1; 0 <= i ;i--) reverse_value += valor_inserido.charAt(i);
        reverse_value_int = Integer.parseInt(reverse_value);//metodo para converter uma string para int
        return reverse_value_int;
    }

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        quest9 mn = new quest9();   

        System.out.print("Informe um valor inteiro de três dígitos: ");
        String valor = leitura.nextLine();
        leitura.close();

        int valor_reverse = mn.reverse(valor);

        System.out.printf("O valor invertido é: %d\n",valor_reverse); 
    }
}