/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 08/05/2019
Objetivo sucinto do programa: implementa interface que mostra todos metodos obrigatorios
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb
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
