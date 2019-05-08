/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 08/05/2019
Objetivo sucinto do programa: Implementa excecao personalizada
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb
*/

package servico;

public class ServicoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	
	public ServicoException(String msg, Integer codigo) {
		super(msg);
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
}
