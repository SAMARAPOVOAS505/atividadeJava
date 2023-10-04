import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de fábrica do carro: ");
        double fabrica = input.nextDouble();


        System.out.print("O consumidor é portador de necessidades? (S/N): ");
        char portadorNecessidades = input.next().charAt(0);

        double porcentagemDistribuidor = 0.28; 
        double impostos = 0.45; 
        double descontoportadorNecessidades = 0.20; 

        double custoConsumidor = fabrica + (fabrica * porcentagemDistribuidor) + (fabrica * impostos);
                
        if (portadorNecessidades == 'S' || portadorNecessidades == 's') {
            custoConsumidor -= custoConsumidor * descontoportadorNecessidades;
        }

        System.out.println("O custo ao consumidor é: R$" + custoConsumidor);

        input.close();
    }
}
