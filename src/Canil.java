import java.util.ArrayList;


public class Canil{
	
	public static void main(String[] args){
		Teclado input = new Teclado();
		ArrayList <Cachorro> canil = new ArrayList<Cachorro>();
		int op;
	  	int id;
	  	Cachorro dog;
		
	   do{	
		   	//Menu
		   	System.out.println("\n\t\t\t---------------*----------------.");
		    System.out.println("\n\t\t\t-------- MENU -> Canil ---------");
		    System.out.println("\n\t\t\t---------------*----------------.");
		    System.out.println("\t\t\t1. Cadastrar cachorro.");
	        System.out.println("\t\t\t2. Listar cachorros.");
	        System.out.println("\t\t\t3. Adotar cachorro.");
	        System.out.println("\t\t\t4. Alimentar cachorro.");
	        System.out.println("\t\t\t5. Exercitar cachorro.");
	        System.out.println("\t\t\t6. Sair.");
			System.out.print("\t\t\tOpção: ");
		   	op = input.lerInt();
		   	
	        switch(op){
	            case 1: 
	            	//1. Cadastrar cachorro
	            	System.out.println("\n\t\t\t---------------*----------------");
	            	System.out.println("\t\t\t----- Cadastrar Cachorro -----");
	            	System.out.println("\t\t\t---------------*----------------\n");
	                System.out.print("\t\t\tEntre com o nome do cachorro: ");
	                String nome = input.lerString();
	                
	                
	                System.out.print("\t\t\tEntre com a idade do cachorro: ");
	                int idade = input.lerInt();
	                
	                
	                System.out.print("\t\t\tEntre com o peso do cachorro: ");
	                double peso = input.lerDouble();
	                Cachorro novoCachorro = new Cachorro(nome, idade, peso);
	                
	                canil.add(novoCachorro);
	            break;
	            case 2: 
	            	//2. Listar Cachorros
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	System.out.println("\n\t\t\t------ Lista de cachorros ------");
	            	System.out.println("\n\t\t\t---------------*----------------\n.");
	                for (Cachorro cachorro: canil) {
	                	
		                	if (!cachorro.ehAdotado()) {
			                	System.out.println("\t\t\tId: " + canil.indexOf(cachorro));
			                	System.out.println("\t\t\tNome: " + cachorro.getNome());
			                	System.out.println("\t\t\tIdade: " + cachorro.getIdade());
			                	System.out.println("\t\t\tPeso: " + cachorro.getPeso());
			                	System.out.println("\n\t\t\t-----------------------------------\n");
			                	
		                	}
	                }
	            break;
	            case 3:
	            	// Adotar cachorro
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	System.out.println("\n\t\t\t------------ Adoção ------------\n");
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	
	            	System.out.print("\t\t\tEntre com o id do cachorro: ");
	            	id = input.lerInt();
	            	dog = canil.get(id);
	            	
	            	if(canil.contains(dog)) {
	            		if(!dog.ehAdotado()) {
	            			dog.setAdotado(true);
	            			System.out.println("\t\t\t" + dog.getNome() + " Foi adotado(a)\n");
	            		}else {
	            			System.out.println("\t\t\tCachorro já adotado.\n");
	            		}
	            	
	            	}else {
	            		System.out.println("\t\t\tCachorro não encontrado.\n");
	            	}
	          
	            	System.out.println("\t\t\t--------------------*------------------\n");
	            		
	            		
	            break;
	            case 4:
	            	// Alimentar Cachorro
	            	double quantidade;
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	System.out.println("\n\t\t\t------- Dog's Restaurant ------\n");
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	System.out.println("\t\t\tVocê deseja: \n1. Alimentar um cachorro\n2. Alimentar todos os cachorros");
	            	System.out.print("\t\t\tOpção: ");
	            	int opAlimentar = input.lerInt();
	            	
	            	if(opAlimentar == 1) {
	            		System.out.println("\t\t\tEntre com a ID do cachorro: ");
	            		id = input.lerInt();
	            		dog = canil.get(id);
	            		if(canil.contains(dog)) {
	            			System.out.print("\t\t\tDigite a quantidade de ração: ");
	            			quantidade = input.lerDouble();
	            			dog.alimentarCachorro(quantidade);
	            			System.out.println("\t\t\t" + dog.getNome() + " Foi alimentado(a)");
	            		}else {
	            			System.out.println("\t\t\tCachorro não encontrado.");
	            		}
	            	}
	            	if(opAlimentar == 2) {
	            		System.out.print("\t\t\tDigite a quantidade de ração: ");
            			quantidade = input.lerDouble();
	            		for(Cachorro cachorro: canil) {
	            			cachorro.alimentarCachorro(quantidade);
	            			System.out.println("\t\t\t" + cachorro.getNome() + " foi alimentado(a).");
	            		}
	            	}else {
	            		System.out.println("\t\t\tEntre com uma opção válida.");
	            	}
	            	
	            break;
	            case 5: 
	            	//Exercitar cachorro
	            	double distancia;
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	System.out.println("\n\t\t\t----------- Dog's Gym ----------\n");
	            	System.out.println("\n\t\t\t---------------*----------------.");
	            	System.out.println("\t\t\tVocê deseja: \n1. Exercitar um cachorro\n2. Exercitar todos os cachorros");
	            	int opExercitar = input.lerInt();
	            	
	            	if(opExercitar == 1) {
	            		System.out.println("\t\t\tEntre com a ID do cachorro: ");
	            		id = input.lerInt();
	            		dog = canil.get(id);
	            		if(canil.contains(dog)) {
	            			System.out.println("\t\t\tDigite a Distância: ");
	            			distancia = input.lerDouble();
	            			dog.exercitarCachorro(distancia);
	            			System.out.println("\t\t\t" + dog.getNome() + " Foi exercitado(a)");
	            		}else {
	            			System.out.println("\t\t\tCachorro não encontrado.");
	            		}
	            	}
	            	if(opExercitar == 2) {
	            		System.out.println("\t\t\tDigite a distância: ");
            			distancia = input.lerDouble();
	            		for(Cachorro cachorro: canil) {
	            			cachorro.exercitarCachorro(distancia);
	            			System.out.println("\t\t\t" + cachorro.getNome() + " foi exercitado(a).");
	            		}
	            	}else {
	            		System.out.println("\t\t\tEntre com uma opção válida.");
	            	}
	            break;
	            case 6: 
	            	for (int i=0; i<25; i++)
	            	{
	            	    System.out.println();
	            	}
	            	
	            	System.out.println("\n\t\t\t---------------*-----------------");
	                System.out.println("\t\t\tObrigado por utilizar o Canil app");
	                System.out.println("\t\t\t---------------*-----------------");
	            break;
	            default:
	            	System.out.println("\n-\t\t\t--------------*----------------.");
	            	System.out.println("\t\t\tEntre com uma opção válida.");
	            	System.out.println("\t\t\t-----------------*----------------");
	        } 	
	   }while(op!=6);
	}
}


	
