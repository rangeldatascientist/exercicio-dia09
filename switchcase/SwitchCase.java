package switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Exercício 05 - lista 02 Switch case
		// Estrutura básica do código:
		Scanner read = new Scanner(System.in);
		
		int codigo, quantidade, total;
		
		System.out.println("Código do produto");
		codigo = read.nextInt();
		System.out.println("Quantidade: ");
		quantidade = read.nextInt();
		
				// O que eu preciso que o cliente veja;
				switch (codigo) {
		        case 1: {
		            System.out.println("Produto: Cachorro-quente");
		            total = quantidade * 10;
		            System.out.println("Valor total: R$" + total);
		            break;
		        }
		        case 2: {
		            System.out.println("Produto: X-Salada");
		            total = quantidade * 15;
		            System.out.println("Valor total: R$" + total);
		            break;
		        }
		        case 3: {
		            System.out.println("Produto: X-Bacon");
		            total = quantidade * 18;
		            System.out.println("Valor total: R$" + total);
		            break;
		        }
		        case 4: {
		            System.out.println("Produto: Bauru");
		            total = quantidade * 12;
		            System.out.println("Valor total: R$" + total);
		            break;
		        }
		        case 5: {
		            System.out.println("Produto: Refrigerante");
		            total = quantidade * 8;
		            System.out.println("Valor total: R$" + total);
		            break;
		        }
		        case 6: {
		            System.out.println("Produto: Suco de laranja");
		            total = quantidade * 13;
		            System.out.println("Valor total: R$" + total);
		            break;
		        }
		        default:
		            System.out.println("Opção inválida.");
		        }
		
		
	

	}

}
