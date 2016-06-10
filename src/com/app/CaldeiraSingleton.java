package com.app;

import com.service.CaldeiraChocolate;

public class CaldeiraSingleton {

	public static void main(String[] args) {

		CaldeiraChocolate caldeira = CaldeiraChocolate.getInstance();
		System.out.println("--------------------------------------\n");
		
		caldeira.drenar();
		caldeira.encher();
		caldeira.encher();
		caldeira.ferver();
		caldeira.encher();
		caldeira.ferver();
		caldeira.drenar();
		
		System.out.println("\n");
		
		CaldeiraChocolate segundaCaldeira = CaldeiraChocolate.getInstance();
		System.out.println("--------------------------------------\n");
	    
		segundaCaldeira.drenar();
		segundaCaldeira.encher();
		segundaCaldeira.ferver();
		segundaCaldeira.encher();
		segundaCaldeira.ferver();
		segundaCaldeira.drenar();
		
	}

}
