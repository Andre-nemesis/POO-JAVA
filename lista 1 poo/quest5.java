public class quest5 {
    public static void main(String[] args){
        //Imprima os primeiros números da série de Fibonacci até passar de 100
        int aux = 0;
        int soma;
        int valor = 1;
        for (int i = 0 ;i <= 10;i++){
            if (i == 0) System.out.println(1);
                soma = aux + valor;
                System.out.println(soma);
                aux = valor;
                valor = soma;
            
            
        }
    }
}
