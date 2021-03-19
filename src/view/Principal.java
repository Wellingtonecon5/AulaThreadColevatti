package view;

import java.time.LocalDate;

import controller.ThreadDados;


public class Principal {

	public static void main(String[] args) {
		
		
		
		int permissoes = 2;
		LocalDate localizacao = new LocalDate(localizacao);
		
		for (int idThread = 0; idThread < 21; idThread++) {
			Thread tThread = new ThreadDados(idThread,localizacao);
			tThread.start();
			

	}

   }
}