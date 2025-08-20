package questao02;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		//dados da primeira conta
		System.out.println("Dados da primeira conta: ");
		System.out.println("Número da conta: ");
		c1.setNumero(scanner.nextLine());
		System.out.println("Titular da conta: ");
		c1.setTitular(scanner.nextLine());
		
		//dados da segunda conta
		System.out.println("Dados da segunda conta: ");
		System.out.println("Número da conta: ");
		c2.setNumero(scanner.nextLine());
		System.out.println("Titular da conta: ");
		c2.setTitular(scanner.nextLine());
		
		//operações
		c1.depositar(1000.00);
		c1.depositar(700.00);
		c2.depositar(5000.00);
		c2.sacar(3000.00);
		c2.transferir(c1, 1800.00);
		
		//exibindo 
		
		System.out.println("Saldos finais");
		System.out.println("Titular: " + c1.getTitular() + "Saldo: R$ " + c1.getSaldo());
		System.out.println("Titular: " + c2.getTitular() + "Saldo: R$ " + c2.getSaldo());
		
		scanner.close();
		
	}

}
