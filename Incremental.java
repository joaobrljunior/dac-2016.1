package trabalho;

public class Incremental {
	public static Incremental instancia;
	private static int count = 0;
	private int numero;
	
	private Incremental() {
		numero = ++count;
	}
	
	public static Incremental getInstancia(){
		if (instancia == null){
			instancia = new Incremental();
		}
		return instancia;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}
}
