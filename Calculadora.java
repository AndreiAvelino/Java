/*

Faça uma calculadora que forneça as seguintes opções para o
usuário, usando métodos sempre que possível
• A calculadora deve operar sempre sobre o valor corrente na
memória
Estado da memória: 0
Opções:
(1) Somar
(2) Subtrair
(3) Multiplicar
(4) Dividir
(5) Limpar memória
(6) Sair do programa
Qual opção você deseja?

*******************************************************************************/
import java.util.Scanner;

class Main
{
    
    public static void PulaLinha(){
            System.out.println("   ");
    }
    
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		int resp = 0;
		float mem = 0;
		float valor = 0;
		
		do{
		
		    System.out.println("MEMÓRIA: "+ mem);

		    System.out.println("1 - Somar");
		    System.out.println("2 - Subtrair");
		    System.out.println("3 - Multiplicar");
		    System.out.println("4 - Dividir");		    
		    System.out.println("5 - Zerar");
		    System.out.println("6 - Sair");	
		    PulaLinha();
		    
		    System.out.print("Opção: ");
		    resp = teclado.nextInt();
		    
		    while (resp < 1 | resp > 6){
		        System.out.print("OPÇÃO INVÁLIDA - Digite novamente: ");
		        resp = teclado.nextInt();
		    }
		    
		    if (resp <= 4){
    		    System.out.print("Informe um valor: ");
    		    valor = teclado.nextFloat();
		    }

		    while (resp == 4 & valor == 0) {
	            System.out.print("VALOR INVÁLIDO PARA DIVISÃO - Digite novamente: ");
		        valor = teclado.nextFloat();
		    }
		    
		    PulaLinha();
		    
		    switch(resp){
		        
		        case 1: mem += valor;
		                break;
		        case 2: mem -= valor;
		                break;
		        case 3: mem *= valor;
		                break;
		        case 4: mem /= valor;
		                break;
		        case 5: mem = 0;
		                break;
		    }
		 
		}while (resp != 6);
		 
	}
}
