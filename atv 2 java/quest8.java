/*
 Um hotel com 42 apartamentos resolveu fazer promoções para os fins de semana fora da alta temporada,
  isto é, nos meses de abril, maio, junho, agosto, setembro, outubro e novembro. 
  A taxa da promoção é de 22% da diária normal. A ocupação média do hotel sem promoção é de 40%. 
  A expectativa é aumentar a taxa de ocupação para 70%. Supondo que as expectativas se confirmem, 
  escrever um algoritmo que lê a diária normal, que calcule e escreva as seguintes informações: 
    (a) O valor da diária no período da promoção. 
    (b) O valor médio arrecadado sem a promoção, durante um mês. 
    (c) O valor médio arrecadado com a promoção, durante um mês. 
    (d) O lucro ou prejuízo mensal com a promoção. 

 */

import java.util.Scanner;

public class quest8 {
    private void promocoes(double valor_d){
        double valor_diaria_promo = valor_d - (valor_d*0.22);
        double media_valor_mes = valor_d + (valor_d*0.4);
        double media_valor_mes_promo = valor_d + (valor_d*0.7);
        double lucro_prejuizo = media_valor_mes - media_valor_mes_promo;
        for (int i =0;i<=20;i++) System.out.print("=*");
        System.out.printf("\nValor da diária no período da promoção: %.2f\n"+
        "Valor médio arrecadado sem a promoção, durante um mês: %.2f\n"+
        "Valor médio arrecadado com a promoção, durante um mês: %.2f\n"+
        "Lucro ou prejuízo mensal com a promoção: %.2f\n",
        valor_diaria_promo,media_valor_mes,media_valor_mes_promo,lucro_prejuizo);
        for (int i =0;i<=20;i++) System.out.print("=*");
        System.out.println("");
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        quest8 mn = new quest8();   
        System.out.print("Digite o valor da Diária normal do hotel: ");
        double valor_diario = leitura.nextDouble();
        leitura.close();
        mn.promocoes(valor_diario);
    }
}
