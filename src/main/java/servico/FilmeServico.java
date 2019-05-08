/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 08/05/2019
Objetivo sucinto do programa: Implementa classe que manipula dados de filme
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb
*/

package servico;

import java.util.List;

import dao.DaoFactory;
import dao.FilmeDao;
import dao.Transaction;
import dominio.Filme;

public class FilmeServico {

	private FilmeDao dao;

	public FilmeServico() {
		dao = DaoFactory.criarFilmeDao();
	}
	
	public void inserirAtualizar(Filme x) {
		try {
			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
		} catch(RuntimeException e) {
			if(Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void excluir(Filme x) {
		try {
			Transaction.begin();
			dao.excluir(x);
			Transaction.commit();
		} catch(RuntimeException e) {
			if(Transaction.isActive()) {
				Transaction.rollback();
			}
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public Filme buscar(int cod) {
		return dao.buscar(cod);
	}

	public List<Filme> buscarTodos() {
		return dao.buscarTodos();
	}
	
	public List<Filme> buscarPorNomeAno(String nome, int anoMin, int anoMax) {
		return dao.buscarPorNomeAno(nome, anoMin, anoMax);
	}
}
