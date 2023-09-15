import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	
	public class TesteSoma {
	    @Test
	    public void testSomar() {
	    assertEquals(5, Soma.somar(2, 3));
	    }
	    
	    
	  public class TesteSubtracao {
		  @Test
		  public void testsubtrair() {
		  assertEquals(5, Subtracao.subtrair(8, 3));
		  }
		  
		public class TesteDivisao {
		 @Test
		 public void testdivisao() {
		 assertEquals(2, Divisao.divisao(6, 3));
			  }
		 
		 public class TesteMultiplicacao {
		 @Test
		public void testmultiplicar() {
		assertEquals(10, Multiplicacao.multiplicar(5, 2));
				  }
}
