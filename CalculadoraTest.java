import static org.junit.jupiter.api.Assertions.*;//importar as asserções do JUnit

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	// Classe de teste para a operação de soma
	    public class TesteSoma { //testar soma
	    @Test
	    public void testSomar() {
	    assertEquals(5, Soma.somar(2, 3)); // o resultado deve ser 5
	    }
	    
	    // Classe de teste para a operação de subtracao
	         public class TesteSubtracao {
		  @Test
		  public void testsubtrair() {
		  assertEquals(5, Subtracao.subtrair(8, 3));// o resultado deve ser 5
		  }

	// Classe de teste para a operação de divisao
		public class TesteDivisao {
		 @Test
		 public void testdivisao() {
		 assertEquals(2, Divisao.divisao(6, 3));// o resultado deve ser 2
			  }
			
        // Classe de teste para a operação de multiplicacao
		 public class TesteMultiplicacao {
		 @Test
		 public void testmultiplicar() {
		 assertEquals(10, Multiplicacao.multiplicar(5, 2));// o resultado deve ser 10
				  }
}
