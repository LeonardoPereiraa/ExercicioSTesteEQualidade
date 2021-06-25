package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;






public class CalculadoraTest {
	
	@Test
	public void somaTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.soma(2, 2), 4);

	}
	@Test
	public void subtracaoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.subtracao(2, 2), 0);
	}
	@Test
	public void divisaoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.divisao(2, 2), 1);
		
	}
	@Test
	public void multiplicacaoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.multiplicacao(2, 2), 4);
		
	}
	@Test
	public void somatoriaTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.somatoria(2), 3);
		
	}
	
	
	
	
	
	@Test
	public void ehPositivoTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.ehPositivo(2), true);
		Assertions.assertEquals(calc.ehPositivo(-2), false);
		
	}
	@Test
	public void comparaTest() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(calc.compara(2, 2), 0);
		Assertions.assertEquals(calc.compara(2, 1), 1);
		Assertions.assertEquals(calc.compara(2, 3), -1);
		
	}

}
