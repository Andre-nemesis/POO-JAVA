// 1 - Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.

import java.util.Scanner;

public class quest1{
    public void tabuada(int valor){
        System.out.printf("Tabauda do número %d",valor);
        for (int i = 0;i<10;i++) System.out.printf("%d x %d = %d\n",valor,i,(valor*i));
    }

    public static void main(String [] args){
        Scanner leitura = new Scanner(System.in);
        int valor;
        
        while(true){
            System.out.print("Digite um número: ");
            valor = leitura.nextInt();
            if (valor==1||valor==2||valor==3||valor==4||valor==5||valor==6||valor==7||valor==8||valor==9) {
                leitura.close();
                break;
            }
            else System.out.println("Valor inválido!\nDigite novamente.");
        }
        quest1 men = new quest1();
        men.tabuada(valor);
    }
}