/*
 Escreva um programa Java console que lê um valor inteiro e 
 simule o comportamento de um caixa eletrônico, ou seja, 
 calcule qual o menor número possível de notas de 100, 50, 10, 5 e 1 
 em que o valor a ser sacado pode ser decomposto. 
 Seu programa deverá exibir uma saída parecida com: 

    Informe o valor do saque (valor inteiro): 139 
    O valor do saque pode ser expresso em: 
    1 notas de 100 
    0 notas de 50 
    3 notas de 10 
    1 notas de 5 
    4 notas de 1 
 */

import java.util.Scanner;

public class quest7 {
    private void caixa_eletronico(int valor){
        int notas_100 = valor / 100;
        int notas_50 = (valor - (notas_100 * 100)) / 50;
        int notas_10 = (valor - (notas_100 * 100) - (notas_50 * 50)) / 10;
        int notas_5 = (valor - (notas_100 * 100) - (notas_50 * 50) - (notas_10 * 10)) / 5;
        int notas_1 = (valor - (notas_100 * 100) - (notas_50 * 50) - (notas_10 * 10) - (notas_5 * 5));
        for (int i =0;i<=20;i++) System.out.print("=*");
        System.out.println("\nO valor do saque pode ser expresso em:");
        System.out.printf("|%d notas de 100|\n|%d notas de 50|\n|%d notas de 10|\n|%d notas de 5|\n|%d notas de 1|\n",notas_100,notas_50,notas_10,notas_5,notas_1);
        for (int i =0;i<=20;i++) System.out.print("=*");
        System.out.println("");
    }
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        quest7 mn = new quest7();
        System.out.print("Informe o valor do saque (valor inteiro): ");
        int valor_saque = leitura.nextInt();
        leitura.close();
        mn.caixa_eletronico(valor_saque);
    }
}
