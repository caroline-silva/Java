import java.util.Scanner; //Importando a Classe Scanner

public class EntradaDados {
	
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in); //Criar um objeto Scanner
		System.out.println("Entre com o seu nome");

		String nome= meuScanner.nextLine(); //Le od dados digitados
		System.out.println("Seu nome eh:" + nome); //Imprime nome
		
	}

}
