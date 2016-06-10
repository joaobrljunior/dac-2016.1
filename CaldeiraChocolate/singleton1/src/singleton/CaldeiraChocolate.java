package singleton;

public class CaldeiraChocolate {

	public static CaldeiraChocolate caldeiraChocolate;
	
	private boolean vazia;
	private boolean fervida;
	
	private CaldeiraChocolate() {
		this.vazia = true;
		this.fervida = false;
	}
	public static CaldeiraChocolate getInstance(){
		if(caldeiraChocolate == null){
			synchronized (CaldeiraChocolate.class){
				if(caldeiraChocolate == null){
					caldeiraChocolate = new CaldeiraChocolate();
					System.out.println("Você acabou de disponibilizar uma caldeira de chocolate.\n\n\n\n\n");
				}
			}
		}else{
			System.out.println("Caldeira já disponivel... \n\n\n\n\n");
		}
		return caldeiraChocolate;
	}
	
	public static CaldeiraChocolate getCaldeira(){
		if(caldeiraChocolate == null){
			getInstance();
		}
		return caldeiraChocolate;
	}
	
	public void encher(){
		if(vazia){
			this.vazia = false;
			this.fervida = false;
			System.out.println("Enchendo Caldeira com chocolate e leite. \n\n\n\n\n");
		}else{
			System.out.println("Caldeira já está cheia!\n\n\n\n\n");
		}
	}
	
	public void drenar(){
		if(!vazia && fervida){
			System.out.println("Drenando o leite e o chocolate fervidos");
			this.vazia = true;
			this.fervida = false;
		}else if(vazia){
			System.out.println("Caldeira vazia, favor encher caldeira!");
		}else{
			System.out.println("Por favor ferver Caldeira");
		}
	}
	
	public void ferver(){
		if(vazia){
			System.out.println("Por favor encher Caldeira primeiro!");
		}else if(fervida){
			System.out.println("Chocolate já fervido!");
			
		}else{
			fervida = true;
			System.out.println("Fervendo Caldeira!");
		}
	}

	public boolean isVazia() {
		return vazia;
	}

	public void setVazia(boolean vazia) {
		this.vazia = vazia;
	}

	public boolean isFervida() {
		return fervida;
	}

	public void setFervida(boolean fervida) {
		this.fervida = fervida;
	}
	
	
	
	
}
