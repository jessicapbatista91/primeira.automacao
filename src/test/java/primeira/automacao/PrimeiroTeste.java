package primeira.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTeste;

public class PrimeiroTeste {
	
	MetodosDeTeste metodos = new MetodosDeTeste();
	
    By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	
    @Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.amazon.com.br");
	
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
		
	}

	
	@Test
	public void validarTitle() throws IOException {
		metodos.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");
		metodos.evidenciarTeste("CT01 - validando titulo");
	}
	@Test
	public void buscarProduto () throws IOException {
		metodos.escrever(pesquisar, "Iphone 13");
		metodos.evidenciarTeste("CT02 - Buscar produto");
	}

}
