import java.util.Scanner;


public class SystemController {
	private static int res;
	
	public static int menuStructure(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Estruturas de dados: ");
		System.out.println("1 - Pilha");
		System.out.println("2 - Fila");
		System.out.println("3 - Lista");
		System.out.print("Escolha em qual estrutura inserir: ");
		res = sc.nextInt();
		return res;
	}
	
	public static int menuStack(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Opçoes: ");
		System.out.println("1 - Empilhar");
		System.out.println("2 - Desempilhar");
		System.out.println("3 - Apenas Consultar");
		System.out.println("4 - Tamanho da Pilha");
		System.out.print("Escolha a opção: ");
		res = sc.nextInt();
		return res;
	}
	
	public static int menuQueue(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Opçoes: ");
		System.out.println("1 - Enfileirar");
		System.out.println("2 - Desenfileirar");
		System.out.println("3 - Apenas Consultar");
		System.out.println("4 - Tamanho");
		System.out.print("Escolha a opção: ");
		res = sc.nextInt();
		return res;
	}
	
	public static int menuList(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Opçoes: ");
		
		System.out.println("1 - add no início da lista");
		System.out.println("2 - add no fim da lista");
		System.out.println("3 - add em qualquer parte da lista");
		System.out.println("4 - remover no início da lista");
		System.out.println("5 - remover no fim da lista");
		System.out.println("6 - remover em qualquer parte da lista");
		System.out.println("7 - consultar o início da lista");
		System.out.println("8 - consultar o fim da lista");
		System.out.println("9 - consultar em qualquer parte da lista");
		System.out.println("10 - Tamanho da lista");
		System.out.println("11 - retornar elemento de indice");
		System.out.println("12 - retornar indice de elemento");
		
		System.out.print("Escolha a opção: ");
		res = sc.nextInt();
		return res;
	}
	
	public static int digiteElement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um valor do tipo inteiro: ");
		res = sc.nextInt();
		return res;
	}
	
	public static boolean continua() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Deseja continuar? (1 - Sim / 0 - Não): ");
		res = sc.nextInt();
		switch (res) {
		case 1:
			return true;
		case 0:
			return false;
		default:
			return continua();
		}
		
	}
	
}
