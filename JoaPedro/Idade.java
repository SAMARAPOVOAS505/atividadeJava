import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        double altura, peso;
        int maisDe50 = 0;
        double somaAlturas = 0;
        int entre10e20 = 0;
        int pesoMenor40 = 0;
        int totalPessoas = 0;

        char continuar;

        do {
            System.out.print("Digite a idade: ");
            idade = input.nextInt();
            System.out.print("Digite a altura (em metros): ");
            altura = input.nextDouble();
            System.out.print("Digite o peso (em quilos): ");
            peso = input.nextDouble();

            totalPessoas++;

            if (idade > 50) {
                maisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                entre10e20++;
            }

            if (peso < 40) {
                pesoMenor40++;
            }

            System.out.print("Deseja inserir os dados de outra pessoa? (S/N): ");
            continuar = input.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        if (totalPessoas > 0) {
            double mediaAlturas10a20 = entre10e20 > 0 ? somaAlturas / entre10e20 : 0;
            double porcentagemPesoMenor40 = (double) pesoMenor40 / totalPessoas * 100;

            System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + maisDe50);
            System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas10a20 + " metros");
            System.out.println("Porcentagem das pessoas com peso inferior a 40 quilos: " + porcentagemPesoMenor40 + "%");
            System.out.println("Quantidade total de vezes que o sistema rodou: " + totalPessoas);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        input.close();
    }
}
