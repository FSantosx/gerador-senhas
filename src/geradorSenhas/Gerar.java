package geradorSenhas;

import java.util.UUID;

public class Gerar {
	
	
	private String senhaLonga;

	public String getSenhaLonga() {
		return senhaLonga;
	}

	public void setSenhaLonga(String senhaLonga) {
		this.senhaLonga = senhaLonga;
	}

	public String senha() {
		String gerar = UUID.randomUUID().toString();
		setSenhaLonga(gerar);
		return senhaLonga;
	}
}
