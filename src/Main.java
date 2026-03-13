import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuacao;


        while (true) {
            long fatorial = 1;
            System.out.print("Digite um número inteiro positivo para calcular o fatorial:");
            int numero = entrada.nextInt();
            entrada.nextLine(); //evitar bug do Scanner

            //validar entrada de valor positivo
            if(numero < 0){
                System.out.println("ERRO! Fatorial é um número natural inteiro positivo!!");
                continue;
            }
            System.out.print(numero+"!= ");
            //estrutura de repetição para calcular o fatorial e exibir cálculo
            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" x ");
                }
            }
            System.out.println("= "+fatorial);

            System.out.println("Deseja calcular outro fatorial? [s/n]");
            continuacao = entrada.nextLine();
            if(!continuacao.equalsIgnoreCase("s")){
                System.out.println("Até a próxima! ");
                break;
            }


        }
    }
}