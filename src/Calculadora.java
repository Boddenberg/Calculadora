import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int valor1;
		int valor2;
		int operacao;
		
		 
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Qual opera??o voc? deseja executar? Digite o n?mero correspondente:"
		    		+ " Adi??o(1), Subtra??o(2), Multiplica??o(3), Divis?o(4):");
		    
		    
		    operacao = sc.nextInt();
		    
		    switch(operacao) {
		    case 1:
		    	System.out.println("Agora escolha os valores que voc? quer somar");
		    	break;
		    case 2:
		    	System.out.println("Agora escolha os valores que voc? quer subtrair");
		    	break;
		    case 3:
		    	System.out.println("Agora escolha os valores que voc? quer multiplicar");
		    	break;
		    case 4:
		    	System.out.println("Agora escolha os valores que voc? quer dividir");
		    	break;
		    default: 
		    	System.out.println("Voc? n?o escolheu uma op??o v?lida, reinicie o programa!");
		    	sc.close();
		    }
		    
		    
		    
			valor1 = sc.nextInt();	
			
			switch(operacao) {
			case 1: 
				System.out.println("Voc? quer somar " + valor1 + " com qual n?mero?");
				break;
			case 2: 
				System.out.println("Voc? quer subtrair " + valor1 + " de qual n?mero?");
				break;
			case 3: 
				System.out.println("Voc? quer multiplicar " + valor1 + " por qual n?mero?");
				break;
			case 4: 
				System.out.println("Voc? quer dividir " + valor1 + " por qual n?mero?");
				break;
			}
			
			
			valor2 = sc.nextInt();
		
		
			
			switch(operacao) {
			case 1:
				System.out.println("O resultado da sua soma ? " + (valor1 + valor2) + "!");
				break;
			case 2:
				System.out.println("O resultado da sua subtra??o ? " + (valor1 - valor2) + "!");
				break;
			case 3:
				System.out.println("O resultado da sua multiplica??o ? " + (valor1 * valor2) + "!");
				break;
			case 4:
				System.out.println("O resultado da sua divis?o ? " + (valor1 / valor2) + "!");
				break;
				
				
				
		}
		
	}

}
