package pontodevenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loja loja = new Loja();
		loja.addProduto(1, "Arroz", 100);
		loja.addProduto(2, "Feijão", 120);
		loja.addProduto(3, "Cebola", 190);
		loja.addProduto(4, "Cafe", 200);
		loja.addProduto(5, "Sabão", 115);
		loja.fazerVenda(1);
		loja.addProdutoVenda(1, 1, 3); 
		loja.addProdutoVenda(1, 4, 4);
		loja.addProdutoVenda(1, 5, 1);
		Scanner scanner = new Scanner(System.in);	
		int opt = 0;
		while (opt != 9) {
			System.out.println("|------------------------Seleciona uma opção-----------------------------------------|");
			System.out.println();
			System.out.println(" 1- Adicionar especificação de produto");
			System.out.println(" 2- Fazer uma venda");
			System.out.println(" 3- Imprimir uma venda");
			System.out.println(" 4- Valor da maior venda"); //para o aluno fazer
			System.out.println(" 5- Total de todas as vendas"); //para o aluno fazer	
			System.out.println(" 6- Valor da menor venda"); //para o aluno fazer	
			System.out.println(" 7- Produto mais vendido"); //para o aluno fazer
			System.out.println(" 8- A venda mais recente"); //para o aluno fazer
			System.out.println(" 9-Terminar");	
			System.out.println();
			System.out.print("Opção: ");			
			opt = scanner.nextInt();
			switch (opt) {
			case 1:
				System.out.println("|---------------------------Adicionar especificação de produto-------------------------|");			
				System.out.print("Código: ");
				int codigoProduto = scanner.nextInt();
				while (codigoProduto > 0) {
					System.out.print("Descrição: ");
					String desc = scanner.next();
					System.out.print("Preço: ");
					float preco = scanner.nextFloat();
					loja.addProduto(codigoProduto, desc, preco);
					System.out.println("|--------------------------Adicionar especificação de produto-----------------------------|");
					System.out.print("Código: ");
					codigoProduto = scanner.nextInt();
				}
				break;
			case 2:
				System.out.println("|------------------------------------Fazer uma venda-------------------------------------------|");
				System.out.println();
				System.out.print("Codigo da Venda: ");
				int codigoVenda = scanner.nextInt();
				loja.fazerVenda(codigoVenda);
				System.out.println("|------------------------------------Selecione o Produto--------------------------------------|");
				ArrayList<EspesificacaoProduto> lista = loja.listarProdutos();
				for (EspesificacaoProduto item : lista) {
					System.out.printf("%d : %s\n", item.getCodigo(), item.getDescricao());
				}
				System.out.println();
				System.out.print("Código do produto: ");
				int optCodigo = scanner.nextInt();
				while (optCodigo > 0) {
					System.out.print("Quantidade: ");
					int quantidade = scanner.nextInt();
					loja.addProdutoVenda(codigoVenda, optCodigo, quantidade);
					System.out.println("|--------------------------------------------------------------------------------|");
					System.out.print("Código do produto: ");
					optCodigo = scanner.nextInt();
				}				
				break;
			case 3:
				System.out.print("Codigo da venda: ");
				int codigo = scanner.nextInt();
				System.out.println("|----------------------------------- Venda------------------------------------------|");
				System.out.println();
				loja.imprimirVenda(codigo);
				System.out.println("\n");				
				break;
			case 4:

				break;
			}
		}
		//Teste na aula
//		  Loja loja = new Loja(); 
//		  loja.addProduto(1, "Arroz", 100); 
//		  loja.addProduto(2, "Feijão", 120); ...
//		  loja.addProduto(3, "Cebola", 190); 
//		  loja.addProduto(4, "Cafe", 200); 
//		  loja.addProduto(5, "Sabão", 115); 
//		  loja.fazerVenda(1);
//		  loja.addProdutoVenda(1, 1, 3); 
//		  loja.addProdutoVenda(1, 4, 4);
//		  loja.addProdutoVenda(1, 5, 1);
//		  System.out.print("Total: " + loja.totalVenda(1) + " ECV");
		 

	}

}
