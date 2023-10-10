/*
 Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
 utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário 
 deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, será possível 
 obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor
da distância, basta calcular a quantidade de litros de combustível utilizada na viagem 
com a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da
velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem.
 Dica: trabalhe com valores reais
 */

import java.util.Scanner;

public class quest3 {
    private double calc_litro_km(double velocidade,double tempo){
        double dist = velocidade * tempo;
        double l_usado = dist / 12;

        return l_usado;
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double velocidade;
        double tempo;
        System.out.print("Digite a velocidade do carro: ");
        velocidade = leitura.nextDouble();
        System.out.print("Digite o tempo da viagem: ");
        tempo = leitura.nextDouble();
        leitura.close();

        double l_usado;

        quest3 men = new quest3();
        l_usado = men.calc_litro_km(velocidade,tempo);

        System.out.printf("O litros usados foram de: %.2f",l_usado);
    }
}
