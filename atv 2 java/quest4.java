/*
  - Faça um programa que:
  - Leia a cotação do dólar
  - Leia um valor em dólares
  - Converta esse valor para Real
  - Mostre o resultado

 */

import java.util.Scanner;

public class quest4 {
    private double dolar_real(double dolar,double cota_dolar){
        double v_real = dolar * cota_dolar;
        return v_real;
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double cota_dolar;
        double v_dolar;
        
        System.out.print("Digite a cotação do Dolar: ");
        cota_dolar = leitura.nextDouble();
        System.out.print("Digite o valor em Dolar: ");
        v_dolar = leitura.nextDouble();
        leitura.close();

        quest4 men = new quest4();
        double v_real = men.dolar_real(v_dolar, cota_dolar);

        System.out.printf("O valor US$ %.2f em reais é: R$%.2f",v_dolar,v_real);
    }
}
