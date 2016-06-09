package core;

import Entity.CaldeiraChocolate;

public class Fabrica {
	public static void main(String[] args) {
		CaldeiraChocolate.getInstance().encher();
		CaldeiraChocolate.getInstance().ferver();
		CaldeiraChocolate.getInstance().drenar();
	}
}
