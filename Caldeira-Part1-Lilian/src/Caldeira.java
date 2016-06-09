public class Caldeira {
    private static Caldeira instanciaUnica;
    private boolean vazia;
    private boolean fervida;
    
    private Caldeira(){
        vazia = true;
        fervida = false;
    }
    
    public static Caldeira getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Caldeira();
        }
        System.out.println("Caldeira");
        System.out.println("Local:" + instanciaUnica);
        return instanciaUnica;
    }
    
    public void encher() {
        if(isVazia()) {
            vazia = false;
            fervida = false;
            System.out.println("Enchendo a caldeira");
        }else{
            System.out.println("A caldeira nao esta vazia");
        }
    }
    public void drenar () {
        if(!isVazia() && isFervida()) {
            System.out.println("Drenando a mistura");
            vazia = true;
        }else{
            System.out.println("Vazia ou não fervida");
        }
    }
    public void ferver () {
        if(!isVazia() && !isFervida()) {
            System.out.println("fervendo a mistura");
            fervida = true;
        }else{
            System.out.println("Vazia ou Fervida");
        }
    }
    public boolean isVazia() {
        return vazia;
    }
    public boolean isFervida() {
        return fervida; 
    }
    }