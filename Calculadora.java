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

class Main {
    
    public static int Menu(float mem, Scanner teclado){
        
        int resp;
        
		System.out.println("MEMÓRIA: "+ mem); 
		
        System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");		    
		System.out.println("5 - Zerar");
		System.out.println("6 - Sair");
		
		System.out.print("Opção: ");
		resp = teclado.nextInt();
		
		return resp;
		
    }
    
    public static void VerificaOp(int resp, Scanner teclado){

        while (resp < 1 | resp > 6){
		    System.out.print("OPÇÃO INVÁLIDA - Digite novamente: ");
		    resp = teclado.nextInt();
		} 
    }
    
    public static float VerificaValor(int resp, Scanner teclado){
  
        float valor = 0;
        
        System.out.print("Informe um valor: ");
	    valor = teclado.nextFloat();

        while (resp == 4 & valor == 0) {
	        System.out.print("VALOR INVÁLIDO PARA DIVISÃO - Digite novamente: ");
	        valor = teclado.nextFloat();
		}
		
		return valor;
        
    }
    
    public static float FazConta(int resp, float valor, float mem){
        
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

        
        return mem;
    }
    
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
            resp = Menu(mem, teclado);
            PulaLinha();
		    VerificaOp(resp, teclado);

		    if (resp <= 4){
 		        valor = VerificaValor(resp, teclado);
		    }

		    PulaLinha();
    	    mem = FazConta(resp, valor, mem);
     	    PulaLinha();

		 
		}while (resp != 6);
	}
}

