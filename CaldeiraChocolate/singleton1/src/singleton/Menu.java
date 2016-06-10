package singleton;

import java.util.Scanner;

public class Menu {

	public static void menu(){
        System.out.println("\tFabrica de Chocolate");
        System.out.println("0. Fim");
        System.out.println("1. Comprar uma caldeira de chocolate");
        System.out.println("2. Encher a caldeira de chocolate");
        System.out.println("3. Ferver a caldeira de chocolate");
        System.out.println("4  Drenar a caldeira de chocolate");
        System.out.println("5. Consulta");
        System.out.println("Opcao:");
    }

    public static void ComprarCaldeira(){
    	CaldeiraChocolate.getInstance();
    }
    
    public static void encherCaldeira(){
    	CaldeiraChocolate.getCaldeira().encher();
    }
    public static void drenarCaldeira(){
    	CaldeiraChocolate.getCaldeira().drenar();
    }
    
    public static void ferverCaldeira(){
    	CaldeiraChocolate.getCaldeira().ferver();
    }
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
            	ComprarCaldeira();
                break;
                
            case 2:
            	encherCaldeira();
                break;
                
            case 3:
            	ferverCaldeira();
                break;
                
            case 4:
            	drenarCaldeira();
                break;
                
            case 0:
            	System.out.println("Finalizando...");
            	break;
            	
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
