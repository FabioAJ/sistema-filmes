/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 08/05/2019
Objetivo sucinto do programa: Manipular dados das classes Artista,Filme e Participa��o
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb
*/

package dao;

import dao.impl.ArtistaDaoImpl;
import dao.impl.FilmeDaoImpl;
import dao.impl.ParticipacaoDaoImpl;

public class DaoFactory {
	
	public static ArtistaDao criarArtistaDao() {
		return new ArtistaDaoImpl();
	}
	
	public static FilmeDao criarFilmeDao() {
		return new FilmeDaoImpl();
	}
	
	public static ParticipacaoDao criarParticipacaoDao() {
		return new ParticipacaoDaoImpl();
	}
}
