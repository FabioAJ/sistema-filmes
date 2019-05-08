/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 08/05/2019
Objetivo sucinto do programa: implementa interface que mostra todos metodos obrigatorios
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb
*/

package dao;

import java.util.List;

import dominio.Artista;

public interface ArtistaDao {

	public void inserirAtualizar(Artista x);
	public void excluir(Artista x);
	public Artista buscar(int cod);
	public List<Artista> buscarTodos();
	public List<Artista> buscarTodosOrdenadosPorNome();
	public Artista buscaNomeExatoDiferente(Integer codigo, String nome);
	public Artista buscaNomeExato(String nome);
	public List<Artista> buscarPorNome(String trecho);
	
}
