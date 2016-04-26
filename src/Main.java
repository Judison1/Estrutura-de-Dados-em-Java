import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		boolean verifica = true;
		
		int menuStack, menuQueue, menuList, element, index;
		
		StackDynamics stack = new StackDynamics();
		QueueDynamics queue = new QueueDynamics();
		ListDynamics list = new ListDynamics();
		
		// verifica se deseja continuar
		while (verifica) {
			
			boolean verificaStack = true;
			boolean verificaQueue = true;
			boolean verificaList = true;
			
			try {
				
				int menu = SystemController.menuStructure();
				
				switch (menu) {
				
				// caso da pilha.
				case 1:
					
					while (verificaStack) {
						
						menuStack = SystemController.menuStack();
						switch (menuStack) {
						
						// caso inserir
						case 1:
							element = SystemController.digiteElement();
							stack.push(element);
							System.out.println(stack.printStack());
							break;
							
						// caso consultar e remover
						case 2:
							System.out.println("elemento = " + stack.pop());
							System.out.println(stack.printStack());
							break;
							
						// caso apenas consultar
						case 3:
							System.out.println("elemento = " + stack.peek());
							System.out.println(stack.printStack());
							break;
							
						// caso tamanho
						case 4:
							System.out.println("tamanho da pilha = " + stack.getSize());
							break;
							
						case 5:
							
							element = SystemController.digiteElement();
							System.out.println("Existe Elemento=" + stack.contains(element));
							
						// nenhum dos casos
						default:
							System.out.println("Nenhuma opção selecionada.");
							break;
						}
						System.out.println("\n\n");
						verificaStack = SystemController.continua("Deseja Continuar na Pilha?");
					
					}
					
					break;
					
				// caso da Fila	
				case 2:
					
					while (verificaQueue) {
						
						menuQueue = SystemController.menuQueue();
						switch (menuQueue) {
						
						// caso enfileirar
						case 1:
							element = SystemController.digiteElement();
							queue.enqueue(element);
							System.out.println(queue.printQueue());
							break;
	
						// caso desenfileirar
						case 2:
							System.out.println(queue.dequeue());
							System.out.println(queue.printQueue());
							break;
							
						// caso apenas consultar
						case 3:
							System.out.println(queue.peek());
							System.out.println(queue.printQueue());
							break;
						
						// caso tamanho
						case 4:
							System.out.println("tamanho da fila=" + queue.getSize());
						
						case 5:
							
							element = SystemController.digiteElement();
							System.out.println("Existe Elemento=" + queue.contains(element));
							
							// nenhum dos casos
						default:
							System.out.println("Nenhuma opção selecionada.");
							break;
						}
						System.out.println("\n\n");
						verificaQueue = SystemController.continua("Deseja Continuar na Fila?");
					
					}
					
					break;
					
				// caso da Lista	
				case 3:
					
					while (verificaList) {
						
						menuList = SystemController.menuList();
						switch (menuList) {
						
						// add no início da lista
						case 1:
							
							element = SystemController.digiteElement();
							list.addFirst(element);
							System.out.println(list.printList());
							break;
						
						// add no fim da lista
						case 2:
							
							element = SystemController.digiteElement();
							list.addLast(element);
							System.out.println(list.printList());
							break;
	
						// add em qualquer parte da lista
						case 3:
							
							System.out.print("Indice - ");
							index = SystemController.digiteElement();
							
							System.out.print("Elemento - ");
							element = SystemController.digiteElement();
							
							list.add(index, element);
							System.out.println(list.printList());
							break;
							
						// remover no início da lista
						case 4:
							
							System.out.println(list.removeFirst());
							System.out.println(list.printList());
							break;
						
						// remover no fim da lista
						case 5:
							
							System.out.println(list.removeLast());
							System.out.println(list.printList());
							break;
	
						// remover em qualquer parte da lista
						case 6:
							
							System.out.print("Indice - ");
							index = SystemController.digiteElement();
							
							System.out.print("Elemento - ");
							element = SystemController.digiteElement();
							
							System.out.println(list.remove(index, element));
							System.out.println(list.printList());
							break;
						
						// consultar o início da lista
						case 7:
							
							System.out.println(list.peekFirst());
							System.out.println(list.printList());
							break;
						
						// consultar o fim da lista
						case 8:
							
							System.out.println(list.peekLast());
							System.out.println(list.printList());
							break;
	
						// consultar em qualquer parte da lista
						case 9:
							
							System.out.print("Indice - ");
							index = SystemController.digiteElement();
							System.out.println(list.peek(index));
							System.out.println(list.printList());
							break;
	
						// Tamanho da lista
						case 10:
							
							System.out.println("Tamanho da lista="+list.getSize());
							break;
	
						// retornar elemento de indice
						case 11:
							
							System.out.print("Indice - ");
							index = SystemController.digiteElement();
							System.out.println(list.elementAt(index));
							System.out.println(list.printList());
							break;
						
						// retornar indice de elemento
						case 12:
							
							System.out.print("Elemento - ");
							element = SystemController.digiteElement();
							System.out.println(list.indexAt(element));
							System.out.println(list.printList());
							break;
						
						case 13:
							
							element = SystemController.digiteElement();
							System.out.println("Existe Elemento=" + list.contains(element));
						default:
							System.out.println("Nenhuma opção selecionada.");
							break;
						}
						System.out.println("\n\n");
						verificaList = SystemController.continua("Deseja Continuar na Lista?");
						
					}
					
					break;
				default:
					break;
				}
				System.out.println("\n\n");
				verifica = SystemController.continua("Deseja continuar na aplicação?");
			} catch (InputMismatchException e) {
				
				System.out.println("Valor não aceito. Inserir 1 para \"Sim\" ou 0 para \"Não\"");
				
			} catch (UnderflowException e) {
				
				System.out.println(e.getMessage());
				
			} catch (IndexOutOfBoundsException e) {
				
				System.out.println(e.getMessage());
				
			}
		}
		
	}

}
