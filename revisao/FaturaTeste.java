package inicio.revisao;

public class FaturaTeste {
	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		Fatura fatura2 = new Fatura();
		double valor_fatura;
		
		fatura.descricao = "Compra de Roupa";
		fatura.numero = 2313;
		fatura.preco_item = 78.67;
		fatura.qtd_comprada = 7;
		
		fatura2.descricao = "Compra de Celular";
		fatura2.numero = 5432;
		fatura2.preco_item = 1678.43;
		fatura2.qtd_comprada = 1;
			
		valor_fatura = fatura.TotalFatura();
		
		System.out.printf("O valor da fatura de %s foi de: %.2f\n",fatura.descricao,valor_fatura);
		valor_fatura = fatura2.TotalFatura();
		System.out.printf("O valor da fatura de %s foi de: %.2f\n",fatura2.descricao,valor_fatura);
		valor_fatura = fatura2.TotalFatura()+ fatura.TotalFatura();
		System.out.printf("O valor da fatura total foi de: %.2f",valor_fatura);
	}
}
