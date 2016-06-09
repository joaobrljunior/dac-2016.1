package caldeira;
public class CaldeiraChocolate2 {
    private static CaldeiraChocolate2 instanciaUnica2 = new CaldeiraChocolate2();
    private boolean vazia;
    private boolean fervida;
    
    private CaldeiraChocolate2(){
        vazia = true;
        fervida = false;
    }
    
    
    public static CaldeiraChocolate2 getInstanceModo2(){
        System.out.println("Modo 2" + instanciaUnica2);
        return instanciaUnica2;
    }
    
    public void encher() {
        if(isVazia()) {
            vazia = false;
            fervida = false;
            System.out.println("Preenchendo a caldeira com a mistura de");
            System.out.println("chocolate e leite.");
            System.out.println("-------------------");
        }else{
            System.out.println("A caldeira nao esta vazia");
            System.out.println("-------------------");
        }
    }
    public void drenar () {
        if(!isVazia() && isFervida()) {
            System.out.println("Drenando o leite e chocolate fervidos.");
            System.out.println("-------------------");
            vazia = true;
        }else{
            System.out.println("A caldeira esta vazia ou ainda nao ferveu");
            System.out.println("-------------------");
        }
    }
    public void ferver () {
        if(!isVazia() && !isFervida()) {
            System.out.println("Coloque o conteudo em ebulicao.");
            System.out.println("-------------------");
            fervida = true;
        }else{
            System.out.println("A caldeira esta vazia ou ja esta fervida");
            System.out.println("-------------------");
        }
    }
    public boolean isVazia() {
        return vazia;
    }
    public boolean isFervida() {
        return fervida; 
    }
    }