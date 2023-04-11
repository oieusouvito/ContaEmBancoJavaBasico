import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		
		String nome = "Victor Daniel Lima de Araujo";
		int numeroConta = 1;
		double saldo = 2500.00;
		int opcao = 0;
		
		System.out.println("***********************************************");
		System.out.println("Conta corrente");
		System.out.println("Titular da conta: " + nome);
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("***********************************************");
		

		
		while(opcao != 4) {
			System.out.println("Digite a opção que deseja: ");
			System.out.println("[1] Verificar saldo da conta");
			System.out.println("[2] Receber transferência");
			System.out.println("[3] Realizar pagamento");
			System.out.println("[4] Sair");
			
			Scanner leitura = new Scanner(System.in);
			opcao = leitura.nextInt();	

			
			switch(opcao) {
				
			case 1:
				System.out.println("Saldo disponível na conta: " + saldo + "\n");
				break;
			case 2:
				System.out.println("Qual o valor da transferência?");
				double transferencia = leitura.nextDouble();
				saldo += transferencia;
				System.out.println("Saldo após transferência: " + saldo + "\n");
				break;
			case 3:
				System.out.println("Qual o valor do pagamento?");
				double pagamento = leitura.nextDouble();
				if(pagamento>saldo) {
					System.out.println("Você não pode pagar pois o saldo da conta é insuficiente!\n");
					break;
				} else {
					saldo -= pagamento;
					System.out.println("Saldo após pagamento: " + saldo + "\n");
					break;
				}

			
			case 4:
				break;
			
			default:
				System.out.println("Valor inválido.\n");
			}
		}
	}
}
