package carrinho;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import carrinho.Carrinho;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;
public class CarrinhoTest {
	
	@Test
	public void getValorTotalTest() {
		Carrinho carrinho = new Carrinho();
		Assertions.assertEquals(carrinho.getValorTotal(),0);
		
	}
	@Test
	public void addItemTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );
		carrinho.addItem(produto1);
		Assertions.assertEquals(carrinho.getQtdeItems(),1);
		
	}
	@Test
	public void removeItemTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );		
		Assertions.assertThrows(ProdutoNaoEncontradoException.class,() -> carrinho.removeItem(produto1));		
		
	}
	
	@Test
	public void getQtdeItemsTest() {
		Carrinho carrinho = new Carrinho();
		Assertions.assertEquals(carrinho.getQtdeItems(),0);
	}
	
	@Test
	public void esvaziaTest() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto("laranja",1.3 );
		carrinho.addItem(produto1);
		carrinho.esvazia();
		Assertions.assertEquals(carrinho.getQtdeItems(),0);
		
	}
	
}
