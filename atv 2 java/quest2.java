/*
 Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
 A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, 
 em que a variável F representa é a temperatura em graus Fahrenheit e a variável C representa a temperatura em graus Celsius.
 */

import java.util.Scanner;

public class quest2 {
    private double cels_faren(double valor){
        return ((9*valor)+160)/5;
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double valor;
        double valor_faren;

        System.out.print("Digite uma temperatura para converte-la em Fahrenheit: ");
        valor = leitura.nextDouble();
        leitura.close();

        quest2 men = new quest2();
        valor_faren = men.cels_faren(valor);

        System.out.printf("A temperatura %.2f° em Fahrenheit é: %.2f°",valor,valor_faren);
    }
}
