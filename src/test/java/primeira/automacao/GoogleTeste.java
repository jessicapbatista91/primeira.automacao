package primeira.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import metodos.MetodosDeTeste;

public class GoogleTeste {
	

	MetodosDeTeste metodos = new MetodosDeTeste();
	
	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.google.com.br");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}
	

	@Test
	
		public void validarTitle() throws IOException {
			metodos.evidenciarTeste("CT02 - titulo google");
			metodos.validarTitle("Google");
	}

}
