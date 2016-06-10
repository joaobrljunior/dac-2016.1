package com.service;

public class CaldeiraChocolate {

	private boolean vazia;
	private boolean fervida;
	private volatile static CaldeiraChocolate instance;

	private CaldeiraChocolate() {
		vazia = true;
		fervida = false;
	}

	public static CaldeiraChocolate getInstance() {
		if (instance == null) {
			
			synchronized (CaldeiraChocolate.class) {
				if (instance == null)
					System.out.println("Criando única instacia de CaldeiraChocolate");
					instance = new CaldeiraChocolate();
			}
		}
		System.out.println("Retornando instancia de CaldeiraChocolate");
		return instance;
	}

	public void encher() {
		if (isVazia()) {
			vazia = false;
			fervida = false;

			System.out.println("Enchendo caldeira...");
		} else {
			System.out.println("Caldeira está cheia");
		}

	}

	public void drenar() {
		if (!isVazia() && isFervida()) {
			vazia = true;

			System.out.println("Drenando 500 galões de mistura...");
		} else {
			System.out
					.println("Caldeira não está cheia ou Mistura não está fervida");
		}

	}

	public void ferver() {
		if (!isVazia() && !isFervida()) {
			fervida = true;

			System.out.println("Fervendo Caldeira..");
		} else {
			System.out
					.println("Caldeira não está cheia ou Mistura está fervida");
		}

	}

	private boolean isFervida() {
		// TODO Auto-generated method stub
		return fervida;
	}

	private boolean isVazia() {
		// TODO Auto-generated method stub
		return vazia;
	}

}
