import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        int opcao = 0;

        do {
            System.out.println("\n**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.println("Digite a opção de 0 a 3: ");


            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    Random aleatorio = new Random();
                    System.out.println("Aposte em um número de 0 a 100 para ser sorteado: ");


                    int numSorteio = ler.nextInt();
                    int numAleatorio = aleatorio.nextInt(100 + 1);

                    if (numSorteio == numAleatorio) {
                        System.out.println("Você ganhou R$ 1.000,00 reais");
                    } else if (numSorteio != numAleatorio) {
                        System.out.println("Que pena! O número sorteado foi: " + numAleatorio);
                    } else {
                        System.out.println("Aposta Inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Digite uma letra de A a Z: ");

                    char letraPremiada = 'T';
                    char letraDigitada = (char) System.in.read(); // Leitura do caractere pelo teclado
                    char letraMaiuscula = Character.toUpperCase(letraDigitada); // Transforma a variável em maíuscula
                    boolean eLetra = Character.isLetter(letraDigitada); // Verifica se a variável é um caractere

                    if (eLetra) {
                        if (letraPremiada == letraMaiuscula) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                        }
                    } else {
                        System.out.println("Aposta Inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Aposte em um numero par ou ímpar: ");
                    int numeroSorteio = ler.nextInt();
                    int verificarNumero = numeroSorteio % 2;

                    if (verificarNumero == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
    }
}