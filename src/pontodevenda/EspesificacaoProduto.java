package pontodevenda;

public class EspesificacaoProduto {
	
	private int codigo;
	
	private String descricao;
	
	private float preco;
	
	
	public EspesificacaoProduto(int codigo, String descricao, float preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}
