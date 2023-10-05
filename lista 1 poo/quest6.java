public class quest6 {
    private int fatorial(int num){
        int fat=1;
        for (int i = 1; i <= num; i++){
                fat = i * fat;
                System.out.printf("%d fatorial é: %d\n",i,fat);
        }
        return num;
    }
    public static void main(String[] args){
        //Imprima os fatoriais de 1 a 10.
        quest6 fat = new quest6();
        fat.fatorial(10);
        
    }
}
