package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br></br>";
	private static final String QUEBRA_DE_LINHA_UNICA = "<br>";

	public Email montarEmailAdministrador(String destinatario, String assunto) {

		StringBuilder texto = new StringBuilder();
		texto
			.append("A/C Administrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		texto
			.append("Solicito altera��o de senha do sistema")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssitatura(texto);
		gerarRodape(texto);

		return new Email(destinatario, assunto, texto.toString());

	}
	
	public Email montarEmailSecretario(String destinatario, String assunto) {

		StringBuilder texto = new StringBuilder();
		texto
			.append("A/C Secret�rio")
			.append(QUEBRA_DE_LINHA_DUPLA);
		texto
			.append("Texto personalizado para secret�rio")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssitatura(texto);
		gerarRodape(texto);

		return new Email(destinatario, assunto, texto.toString());

	}
	private String gerarAssitatura(StringBuilder texto) {
		return texto
					.append("Att.:")
					.append(QUEBRA_DE_LINHA_UNICA)
					.append("Operador de Caixa")
					.append(QUEBRA_DE_LINHA_DUPLA)
					.toString();
		
	}
	private String gerarRodape(StringBuilder texto) {
		
		return texto.append("Email autom�tico. Favor n�o responder esse email").toString();
		
	}

}
