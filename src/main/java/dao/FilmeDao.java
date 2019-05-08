/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 08/05/2019
Objetivo sucinto do programa: implementa interface que mostra todos metodos obrigatorios
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb
*/

package dao;

import java.util.List;

import dominio.Filme;

public interface FilmeDao {

	public void inserirAtualizar(Filme x);
	public void excluir(Filme x);
	public Filme buscar(int cod);
	public List<Filme> buscarTodos();
	public List<Filme> buscarPorNomeAno(String nome, int anoMin, int anoMax);
}
