package controller;

import java.time.LocalDate;
import java.util.concurrent.LocalDate;
public class ThreadDados extends Thread{
	
	private int idThread;
	private static int calculo;
	private static int transacao;
	private LocalDate localizacao;
	
	public ThreadDados (int idThread , LocalDate localizacao) {
		this.idThread = idThread;
		this.localizacao = localizacao;
	
	}
	
	
		private void ThreadTransacao ()  {
    	transacao++;
    	System.out.println("#" + idThread + "transacao");
    	int tempo = (int) ((Math.random()* 0.99) + 1.99);
		
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		private void ThreadCalculo () {
			int calculoThread = (int)((Math.random()* 0.99) + 1.99);
			int transacaoThread = (int)((Math.random()* 0.99) + 1.99);
		
			
		calculo ++;
		System.out.println("#" + idThread +"calculou" + calculoThread + "s.");
		
				
}
}
 
	
			
	
	
	


