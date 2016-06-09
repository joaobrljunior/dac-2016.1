package caldeira;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        CaldeiraChocolate caldeira =CaldeiraChocolate.getInstance();
        caldeira.encher();
        caldeira.ferver();
        caldeira.ferver();
        caldeira.drenar();
        
     }
}
