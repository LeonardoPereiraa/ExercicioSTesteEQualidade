package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;
import produto.ProdutoNaoEncontradoException;






public class CalculadoraTest {
	
	@Test
	public void somaTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 4,calc.soma(2, 2));
	}
	@Test
	public void somaPositivoComNegativoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 0,calc.soma(2, -2));
	}
	
	@Test
	public void subtracaoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 0,calc.subtracao(2, 2));
	}
	@Test
	public void subtracaoDeValoresNegativosTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 0,calc.subtracao(-2, -2));
	}
	@Test
	public void divisaoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 1,calc.divisao(2, 2));
		
	}
	
	@Test
	public void divisaoPorZeroTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertThrows(ArithmeticException.class,() -> calc.divisao(2, 0));	
		
	}
	@Test
	public void multiplicacaoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 4,calc.multiplicacao(2, 2));
		
	}
	@Test
	public void somatoriaTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 3,calc.somatoria(2));
		
	}
	@Test
	public void ehPositivoComentradaPositivaTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(true,calc.ehPositivo(2));
			
	}
	@Test
	public void ehPositivoComEntradaNegativaTest() {
		Calculadora calc = new Calculadora();
		
		Assertions.assertEquals(false,calc.ehPositivo(-2));	
	}
	@Test
	public void comparaValoresIguaisTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals( 0,calc.compara(2, 2));
		
	}
	@Test
	public void comparaPrimeiroMaiorQueSegundoTest() {
		Calculadora calc = new Calculadora();
		
		Assertions.assertEquals( 1,calc.compara(2, 1));

	}
	@Test
	public void comparaSegundoMaiorQuePrimeiroTest() {
		Calculadora calc = new Calculadora();
		
		Assertions.assertEquals( -1,calc.compara(2, 3));
	}

}
