import java.util.Scanner;
public class quest7 {
    public void condition(int valor){
        while(valor!=1){
            if (valor%2==0) valor = valor/2;
            else valor = 3 * valor + 1;
            System.out.print(valor);
            System.out.print(" -> ");
        }
    }
    public static void main(String[] args){
        /*
        Escreva um programa em que, dada uma variável x com algum valor inteiro, 
        temos um novo x de acordo com a seguinte regra:
        Se x é par, x = x / 2 ;
        Se x é impar, x = 3 * x + 1 ;
         */
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = leitura.nextInt();
        leitura.close();
        
        quest7 func = new quest7();
        func.condition(valor);
    }
}
