package Entity;

public class CaldeiraChocolate {
	private boolean vazia;
	private boolean fervida;
	private static CaldeiraChocolate UniqueInstanceCaldeiraChocolate;

	private CaldeiraChocolate() {
		vazia = true;
		fervida = false;
	}

	public static CaldeiraChocolate getInstance() {
		if (UniqueInstanceCaldeiraChocolate == null) {
			UniqueInstanceCaldeiraChocolate = new CaldeiraChocolate();
		}
		return UniqueInstanceCaldeiraChocolate;

	}

	public void encher() {
		if (isVazia()) {
			vazia = false;
			fervida = false;
			System.out.println("enchendo...");
		} else {
			System.out.println("caldeira já cheia");
		}
	}

	public void drenar() {
		if (isVazia() == false && isFervida() == true) {
			vazia = true;
			System.out.println("drenando...");
		} else {
			System.out.println("caldeira vazia ou não fervida");
		}
	}

	public void ferver() {
		if (isVazia() == false && isFervida() == false) {
			fervida = true;
			System.out.println("fervendo...");
		} else {
			System.out.println("caldeira vazia ou já fervida");
		}
	}

	public boolean isVazia() {
		return vazia;
	}

	public boolean isFervida() {
		return fervida;
	}

}
