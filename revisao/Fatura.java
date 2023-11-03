package inicio.revisao;

public class Fatura {
	int numero;
	String descricao;
	int qtd_comprada;
	double preco_item;
	
	public double TotalFatura() {
		return this.preco_item*this.qtd_comprada;
	}
}
