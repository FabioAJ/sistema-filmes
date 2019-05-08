/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 08/05/2019
Objetivo sucinto do programa: Implementa transa��o com o banco de dados
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb
*/

package dao;

import dao.impl.EM;

public class Transaction {
	
	public static void begin() {
		EM.getLocalEm().getTransaction().begin();
	}
	
	public static void commit() {
		EM.getLocalEm().getTransaction().commit();
	}
	
	public static void rollback() {
		EM.getLocalEm().getTransaction().rollback();
	}
	
	public static boolean isActive() {
		return EM.getLocalEm().getTransaction().isActive();
	}
}
