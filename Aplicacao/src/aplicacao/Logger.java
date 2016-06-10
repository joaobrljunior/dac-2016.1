//Aplicando a classe Logger em Singleton, método 3;
package aplicacao;

  public class Logger{
  /* por default não imprime o log */
  private boolean ativo = false;

  //Criação da variável estática e retornando null;
  private volatile static Logger uniqueInstance = null;
  
  //Tornando Logger privado;
  private Logger() {}
   public boolean isAtivo() {
     return this.ativo;
 }
 
 //Método getInstance;
 public static Logger getInstance() {
        if (uniqueInstance == null){
		System.out.println("Criando e sincronizando única instância Logger");
		    synchronized (Logger.class){
			if (uniqueInstance == null){
			uniqueInstance = new Logger();
			}
		   }                      
        }
		    System.out.println("Retornando instância de Logger");
            return uniqueInstance;
    } 
 
  public void setAtivo(boolean b) {
   this.ativo= b;
 }
  public void log(String s) {
   if(this.ativo)
   System.out.println("LOG :: " + s);
 }
 
}