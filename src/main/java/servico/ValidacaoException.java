/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 08/05/2019
Objetivo sucinto do programa: Implementa excecao personalizada
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb
*/

package servico;

import java.util.List;

public class ValidacaoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private List<String> erros;
	
	public ValidacaoException(String msg, List<String> erros) {
		super(msg);
		this.erros = erros;
	}
	
	public List<String> getErros() {
		return erros;
	}
}
