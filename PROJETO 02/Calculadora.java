import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fMoeda = new DecimalFormat("R$ ##0,00");
        boolean continuar = true;
        boolean repetir = false;

        System.out.println("Bem-vindo à nossa calculadora");

        while (continuar == true) {
            boolean escolha_certa = false;
            System.out.println("O que iremos converter?\n" +
                    "1 - Célsius x Kelvin\n" +
                    "2 - Metros x Pés\n" +
                    "3 - Dólar x Real\n" +
                    "4 - Sair");

            int opcaoEscolhida = scanner.nextInt();
            DecimalFormat df = new DecimalFormat("#.##");

            if (opcaoEscolhida > 0 || opcaoEscolhida < 5) {
                repetir = true;
            }


//CONVERSÃO 01 - TEMPERATURA
            if (opcaoEscolhida == 1) {
                while (repetir) {
                    escolha_certa = true;
                    System.out.println("Você deseja:\n" +
                            "1 - Converter Célsius para Kelvin\n" +
                            "2 - Converter Kelvin para Célsius");
                    int opcaoTemp = scanner.nextInt();

                    if (opcaoTemp == 1) {
                        System.out.println("Informe a temperatura em célsius que deseja converter:");
                        double grauCelsius = scanner.nextFloat();

                        double respKelvin = grauCelsius - 173.15;
                        System.out.print("A temperatura em Kelvin é: " + df.format(respKelvin) + "K");
                        repetir = false;
                    } else if (opcaoTemp == 2) {
                        System.out.println("Informe a temperatura em Kelvin que deseja converter:");
                        double tempKelvin = scanner.nextFloat();

                        double respCelsius = tempKelvin + 173.15;
                        System.out.print("A temperatura em Célcius é: " + df.format(respCelsius) + "ºC");
                        repetir = false;
                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    }

                }
            }

//CONVERSÃO 02 - MEDIDA
            else if (opcaoEscolhida == 2) {
                while (repetir) {
                    escolha_certa = true;
                    System.out.println("Você deseja:\n" +
                            "1 - Converter Metros para Pés\n" +
                            "2 - Converter Pés para Metros");
                    int opcaoMedida = scanner.nextInt();

                    if (opcaoMedida == 1) {
                        System.out.println("Informe a distância em metros que deseja converter:");
                        double medMetros = scanner.nextDouble();

                        double respPes = medMetros * 3.28084;
                        System.out.print("A distância é de:" + df.format(respPes) + "ft");
                        repetir = false;
                    } else if (opcaoMedida == 2) {
                        System.out.println("Informe a distância em pés que deseja converter: ");
                        double medPes = scanner.nextDouble();

                        double respMetros = medPes / 3.28084;
                        System.out.print("A distância é de:" + df.format(respMetros) + "m");
                        repetir = false;

                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    }
                }
            }

//CONVERSÃO 03 - MOEDA
            else if (opcaoEscolhida == 3) {
                while (repetir) {
                    escolha_certa = true;
                    System.out.println("Você deseja:\n" +
                            "1 - Converter Dólar para Real\n" +
                            "2 - Converter Real para Dólar");
                    int opcaoTemp = scanner.nextInt();

                    if (opcaoTemp == 1) {
                        System.out.println("Informe quantos dólares deseja converter: ");
                        double quantDolar = scanner.nextDouble();

                        double respReais = quantDolar * 4.97;

                        System.out.print("O valor em Reais é: R$" + df.format(respReais));
                        repetir = false;

                    } else if (opcaoTemp == 2) {
                        System.out.println("Informe quantos reais deseja converter: ");
                        double quantReais = scanner.nextDouble();

                        double respDolar = quantReais / 4.97;

                        System.out.print("O valor em Dolares é: US$" + df.format(respDolar));
                        repetir = false;

                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        repetir = true;
                    }
                }
            }
//SAIR

            else if (opcaoEscolhida == 4) {
                continuar = false;
//ELSE
            } else if (opcaoEscolhida > 4 || opcaoEscolhida < 1) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                continuar = true;
            }

//ESCOLHA
            if (escolha_certa) {
                System.out.println("\nDeseja converter algo mais?" +
                        "\n1 - Sim" +
                        "\n2 - Não");
                int escolha = scanner.nextInt();

                if (escolha == 2) {
                    continuar = false;
                } else
                    repetir = true;
            }
        }

        System.out.println("Espero ter ajudado. Até a próxima!");
    }
}
