import java.util.Scanner;

public class quest9 {
    public void menu(double salario, double aumento,double percent_aumento, double salario_final){
        for (int i=0; i<20;i++) System.out.print("*=");
        System.out.printf("\nO salário antes do reajuste: %.2f\n" + 
                "O percentual de aumento aplicado: %.2f\n" +
                "O valor do aumento: %.2f\n" + 
                "O novo salário, após o aumento: %.2f\n",salario,percent_aumento,aumento,salario_final);
        for (int i=0; i<20;i++) System.out.print("*=");
    }
    private void func(double salario){
        double aumento;
        double percent_aumento;
        double salario_final;
        if (salario<=280){
            percent_aumento = 0.2;
            aumento = salario*percent_aumento;
            salario_final = salario + aumento;
        }
        else if (salario<=700){
            percent_aumento = 0.15;
            aumento = salario*percent_aumento;
            salario_final = salario + aumento;
        }
        else if (salario<=1500){
            percent_aumento = 0.10;
            aumento = salario*percent_aumento;
            salario_final = salario + aumento;
        }
        else{
            percent_aumento = 0.5;
            aumento = salario*percent_aumento;
            salario_final = salario + aumento; 
        }
        quest9 menu = new quest9();
        menu.menu(salario, aumento, percent_aumento, salario_final);
    }
    public static void main(String[] args){
        
        /*
         Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
         baseado no salário atual;
            a. Salários até R$ 280,00 (incluindo): aumento de 20%;
            b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
            c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
            d. Salários de R$ 1500,00 em diante: aumento de 5%

            Após o aumento ser realizado; informe na tela;
            a. O salário antes do reajuste;
            b. O percentual de aumento aplicado;
            c. O valor do aumento;
            d. O novo salário, após o aumento.  
         */

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        double salario = leitura.nextDouble();
        quest9 funcao = new quest9();
        leitura.close();
        funcao.func(salario);
    }
}
