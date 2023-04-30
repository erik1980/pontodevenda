package pontodevenda;

import java.util.ArrayList;


public class Loja {
	
	private final ArrayList<Venda> vendas = new ArrayList<>();
	
	private final ArrayList<EspesificacaoProduto> produtos = new ArrayList<>();
	
	public void fazerVenda(int codigo) {
		vendas.add(new Venda(codigo));
	}
	
	public void addProduto(int codigo, String descricao, float preco) {
		produtos.add(new EspesificacaoProduto(codigo, descricao, preco));
	}
	
	public boolean addProdutoVenda(int codigoVenda, int codigoProduto, int quantidade) {
		Venda venda = buscarVenda(codigoVenda);
		EspesificacaoProduto produto = buscarProduto(codigoProduto);
		if(venda != null && produto != null) {
			venda.fazerLinhaProduto(produto, quantidade);
			return true;
		}
		return false;
		
	}

	private EspesificacaoProduto buscarProduto(int codigoProduto) {
		for(EspesificacaoProduto item : produtos) {
			if(item.getCodigo() == codigoProduto) {
				return item;
			}
		}
		return null;
	}

	private Venda buscarVenda(int codigoVenda) {
		for(Venda item : vendas) {
			if(item.getCodigo() == codigoVenda) {
				return item;
			}
		}
		return null;
	}
	
	public float totalVenda(int codigo) {
		float total = 0;
		Venda venda = buscarVenda(codigo);
		if(venda != null) {
			total = venda.total();
		}
		return total;		
	}
	
	public ArrayList<EspesificacaoProduto> listarProdutos(){
		return new ArrayList<>(produtos);
	}
	
	public void imprimirVenda(int codigo) {
		Venda venda = buscarVenda(codigo);
		if(venda != null) {
			venda.imprimirVenda();
		}
	}

}
