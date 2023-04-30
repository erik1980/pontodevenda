package pontodevenda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {
	
	private int codigo;
	
	private LocalDate date;
	
	private final ArrayList<VendasLinhaProduto> listaProdutos = new ArrayList<>();
	
	public Venda(int codigo) {
		this.codigo = codigo;
		this.date = LocalDate.now();
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public float total() {
		float total = 0;
		for(VendasLinhaProduto item : listaProdutos) {			
			total += item.subTotal();			
		}
		return total;
	}
	
	public void fazerLinhaProduto(EspesificacaoProduto produto, int quantidade) {
		listaProdutos.add(new VendasLinhaProduto(quantidade, produto));
		
	}
	
	public void imprimirVenda() {	
		for(VendasLinhaProduto item : listaProdutos) {
			item.imprimirLinha();
			System.out.println();
		}
		System.out.println();
		System.out.printf(" Total da Venda: %.2f ECV", total());
	}
	
	

}
