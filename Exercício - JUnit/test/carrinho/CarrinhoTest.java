package carrinho;


import static org.junit.Assert.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import carrinho.Carrinho;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;
public class CarrinhoTest {
	
	@Test
	public void getValorTotalTest() {
		Carrinho carrinho = new Carrinho();
		Assertions.assertEquals(0,carrinho.getValorTotal());
		
	}
	@Test
	public void getValorTotalComUmProdutoTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",50 );
		carrinho.addItem(produto1);
		Assertions.assertEquals(50,carrinho.getValorTotal());
	}
	
	@Test
	public void addItemTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );
		carrinho.addItem(produto1);
		Assertions.assertEquals(1,carrinho.getQtdeItems());
		
	}
	@Test
	public void addItemDoisProdutosTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );
		
		Produto produto2 = new Produto("laranja",1.3 );
		carrinho.addItem(produto1);
		carrinho.addItem(produto2);
		Assertions.assertEquals(2,carrinho.getQtdeItems());
		
	}
	
	@Test
	public void removeItemQueNaoEstaNoCarrinhoTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );		
		Assertions.assertThrows(ProdutoNaoEncontradoException.class,() -> carrinho.removeItem(produto1));		
		
	}
	@Test
	public void removeUmItemQueEstaNoCarrinho() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );	
		carrinho.addItem(produto1);
		try {
			carrinho.removeItem(produto1);
			Assertions.assertEquals(0,carrinho.getQtdeItems());
		} catch (ProdutoNaoEncontradoException e) {
			fail("bug");
		}
		
	}
	
	@Test
	public void getQtdeItemsTest() {
		Carrinho carrinho = new Carrinho();
		Assertions.assertEquals(0,carrinho.getQtdeItems());
	}
	@Test
	public void getQtdeItemsParaUmItemTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );	
		carrinho.addItem(produto1);
		Assertions.assertEquals(1,carrinho.getQtdeItems());
	}
	
	@Test
	public void esvaziaTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );
		carrinho.addItem(produto1);
		carrinho.esvazia();
		Assertions.assertEquals(0,carrinho.getQtdeItems());
		
	}
	
}
