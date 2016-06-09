package caldeira;
public class Logger{
    private static Logger instanciaUnica;
    private boolean ativo = false;
    
    private Logger() {}
    
    public static Logger getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Logger();
        }
        return instanciaUnica;
    }
    
    public boolean isAtivo(){
        return this.ativo;
    }
    
    public void setAtivo(boolean b){
        this.ativo = b;
    }
    
    public void log(String s) {
        if(this.ativo){
            System.out.println("LOG :: " + s);
        }
    }
}