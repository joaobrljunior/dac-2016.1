
public class Main {

	public static void main(String[] args) {
		System.out.println("chamada do metodo singleton de unica instancia.");
		Singleton singleton = new Singleton();
		Singleton singleton2 = new Singleton();
		
		singleton.getInstance();
		singleton2.getInstance();
		singleton.getInstance();
		singleton2.getInstance();
		singleton.getInstance();
		
		

	}

}
