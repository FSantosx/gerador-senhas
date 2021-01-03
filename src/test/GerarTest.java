package test;

import org.junit.jupiter.api.Test;

import geradorSenhas.Gerar;

class GerarTest {
	
	@Test
	public void gerar() {
		Gerar senha = new Gerar();
		senha.senha();
		senha.getSenhaLonga();
	}

}
