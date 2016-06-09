public class Singleton {
	private static Singleton uniqueInstance;

	// Aqui podemos adicionar outras variáveis de instância
	// O construtor é particular, somente Singleton pode // instanciar essa
	// classe.
	Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
			System.out.println("primeira instancia chamada");
		}
		System.out.println("a instancia ja esta iniciada");
		return uniqueInstance;
		
	}
	// Outros métodos aqui
}