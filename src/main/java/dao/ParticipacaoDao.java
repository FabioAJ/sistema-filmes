/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 08/05/2019
Objetivo sucinto do programa: implementa interface que mostra todos metodos obrigatorios
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb
*/

package dao;

import java.util.List;

import dominio.Artista;
import dominio.Filme;
import dominio.Participacao;

public interface ParticipacaoDao {

	public void inserirAtualizar(Participacao x);
	public void excluir(Participacao x);
	public Participacao buscar(int cod);
	public List<Participacao> buscarTodos();
	public Participacao buscarExato(String personagem, Artista artista, Filme filme);
	public Participacao buscarExatoDiferente(Integer codigo, String personagem, Artista artista, Filme filme);
}
