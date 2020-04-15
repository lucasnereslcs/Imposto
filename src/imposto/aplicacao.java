package imposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		int count, qtdd;
		char c;
		String nome;
		double renda, saude, total = 0.0;

		Scanner sc = new Scanner(System.in);

		List<Pessoa> pessoas = new ArrayList<>();

		System.out.print("Entre com o numero de pessoas: ");
		count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.print("\nDigite os dados da Pessoa #" + i + ":");
			System.out.print("\nPessoa Fisica ou Juridica (F/J)?");
			c = sc.next().charAt(0);
			if (c == 'f') {
				System.out.print("\nNome:");
				nome = sc.next();
				System.out.print("\nRenda Anual:");
				renda = sc.nextDouble();
				System.out.print("\nGastos com Saude:");
				saude = sc.nextDouble();
				pessoas.add(new Fisica(nome, renda, saude));
			}
			if (c == 'j') {
				System.out.print("\nNome:");
				nome = sc.next();
				System.out.print("\nRenda Anual:");
				renda = sc.nextDouble();
				System.out.print("\nQuantidade de Funcionarios:");
				qtdd = sc.nextInt();
				pessoas.add(new Juridica(nome, renda, qtdd));
			}

		}

		System.out.println();
		System.out.println("IMPOSTOS A SEREM PAGOS:");

		for (Pessoa p : pessoas) {
			System.out.println(p.nome + ": $" + String.format("%.2f", p.Imposto()));
			total += p.Imposto();
		}

		System.out.println("TOTAL DAS TAXAS: $" + String.format("%.2f", total));
		sc.close();

	}

}
