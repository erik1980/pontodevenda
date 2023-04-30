package pontodevenda;

public class VendasLinhaProduto {
	
	private int quantidade;
	
	private EspesificacaoProduto produto;
	
	public VendasLinhaProduto(int quantidade, EspesificacaoProduto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public EspesificacaoProduto getProduto() {
		return produto;
	}

	public void setProduto(EspesificacaoProduto produto) {
		this.produto = produto;
	}

	public float subTotal() {		
		return quantidade * produto.getPreco();
	}

	public void imprimirLinha() {
		System.out.printf(" %d\t\t%s\t\t", produto.getCodigo(), produto.getDescricao());
		System.out.printf("%.2f ECV/UN\t\t%d UN\t\t%.2f ECV", produto.getPreco(), quantidade, subTotal());	
	}


	
	
	
}
