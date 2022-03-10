import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int valor1;
		int valor2;
		int operacao;
		
		 
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Qual operação você deseja executar? Digite o número correspondente:"
		    		+ " Adição(1), Subtração(2), Multiplicação(3), Divisão(4):");
		    
		    
		    operacao = sc.nextInt();
		    
		    switch(operacao) {
		    case 1:
		    	System.out.println("Agora escolha os valores que você quer somar");
		    	break;
		    case 2:
		    	System.out.println("Agora escolha os valores que você quer subtrair");
		    	break;
		    case 3:
		    	System.out.println("Agora escolha os valores que você quer multiplicar");
		    	break;
		    case 4:
		    	System.out.println("Agora escolha os valores que você quer dividir");
		    	break;
		    default: 
		    	System.out.println("Você não escolheu uma opção válida, reinicie o programa!");
		    	sc.close();
		    }
		    
		    
		    
			valor1 = sc.nextInt();	
			
			switch(operacao) {
			case 1: 
				System.out.println("Você quer somar " + valor1 + " com qual número?");
				break;
			case 2: 
				System.out.println("Você quer subtrair " + valor1 + " de qual número?");
				break;
			case 3: 
				System.out.println("Você quer multiplicar " + valor1 + " por qual número?");
				break;
			case 4: 
				System.out.println("Você quer dividir " + valor1 + " por qual número?");
				break;
			}
			
			
			valor2 = sc.nextInt();
		
		
			
			switch(operacao) {
			case 1:
				System.out.println("O resultado da sua soma é " + (valor1 + valor2) + "!");
				break;
			case 2:
				System.out.println("O resultado da sua subtração é " + (valor1 - valor2) + "!");
				break;
			case 3:
				System.out.println("O resultado da sua multiplicação é " + (valor1 * valor2) + "!");
				break;
			case 4:
				System.out.println("O resultado da sua divisão é " + (valor1 / valor2) + "!");
				break;
				
				
				
		}
		
	}

}
