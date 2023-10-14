/*
 Escreva um programa Java console que receberá a duração de um evento 
 expresso em segundos e exiba-o expresso em horas, minutos e segundos. 
 Seu programa deverá exibir uma saída parecida com:
    Informe a duração do evento em segundos: 3712 
    Duração do evento: 01:01:52

 */
import java.util.Scanner;
public class quest6{
    private void Segundos_Horas(int segundos){
        int horas = segundos / 3600;
        int minutos = (segundos - horas * 3600) / 60;
        int segundosRestantes = segundos - horas * 3600 - minutos * 60;
        if (minutos <= 9 && horas <= 9 ) System.out.printf("Duração do evento: 0%d:0%d:%d\n",horas,minutos,segundosRestantes);
        else if (horas <= 9 ) System.out.printf("Duração do evento: 0%d:%d:%d\n",horas,minutos,segundosRestantes);
        else if (minutos <= 9) System.out.printf("Duração do evento: %d:0%d:%d\n",horas,minutos,segundosRestantes);
        else System.out.printf("Duração do evento: %d:%d:%d\n",horas,minutos,segundosRestantes);
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        quest6 mn = new quest6();
        System.out.print("Informe a duração do evento em segundos: ");
        int segundos = leitura.nextInt();
        leitura.close();
        mn.Segundos_Horas(segundos);
        
    }
}