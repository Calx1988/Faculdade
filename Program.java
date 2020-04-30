import javax.swing.text.PlainDocument;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean contMain = true;

        int escolha;

        do {
            boolean contFunction=true;
            System.out.println("\t\tLista de Exercícios Sugeridos - Aula 7\n");
            System.out.println("1 - Exercício Cálculo do Quadrado");
            System.out.println("2 - Teste Sinal de Número");
            System.out.println("3 - Cadastro de Cliente");
            System.out.println("4 - Calcular Fatorial de um Número Inteiro");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção: ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    float lado;
                    System.out.println("\tCálculo de Área e Perímetro de um Quadrado Qualquer\n");
                    while (contFunction == true) {

                        System.out.println("Digite o valor do lado do quadrado: ");
                        lado = input.nextFloat();

                        Quadrado quadrado = new Quadrado(lado);
                        System.out.println("\nA área do quadrado é: " + quadrado.CalcularArea());
                        System.out.println("\nO perímetro do quadrado é: " + quadrado.CalcularPerimetro());
                        System.out.println("\n\nPara realizar um novo cálculo digite '1' ou pressione qualquer outra tecla para voltar ...");
                        escolha = input.nextInt();
                        if (escolha != 1) {
                            contFunction = false;
                        }
                    }
                    break;

                case 2:
                    int valor;
                    System.out.println("\tTeste de Sinal de um Número Inteiro\n");
                    while (contFunction == true) {

                        System.out.println("Digite o número: ");
                        valor = input.nextInt();

                        Numero numero = new Numero(valor);
                        System.out.println("\n" + numero.testarNumero());
                        System.out.println("\n\nPara testar um novo número digite '1' ou pressione qualquer outra tecla para voltar ...");
                        escolha = input.nextInt();
                        if (escolha != 1) {
                            contFunction = false;
                        }
                    }
                    break;

                case 3:
                    String nome;
                    int idade;
                    double renda;
                    System.out.println("\tCadastro de Cliente\n");
                    while(contFunction==true) {
                        System.out.println("Informe o nome do cliente: ");
                        input.useDelimiter("\n");
                        nome = input.next().toUpperCase();
                        System.out.println("Digite a idade: ");
                        idade = input.nextInt();
                        System.out.println("Informe a renda mensal em reais): ");
                        renda = input.nextDouble();
                        Cliente cliente=new Cliente(nome,idade,renda);
                        System.out.println("\n"+cliente.classificarIdade()+cliente.classificarRenda());
                        System.out.println("\n\nPara entrar com um novo cliente digite '1' ou pressione qualquer outra tecla para voltar ...");
                        escolha = input.nextInt();
                        if (escolha != 1) {
                            contFunction = false;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\tCálculo de Fatorial\n");
                    while(contFunction==true){
                        System.out.println("Digite um número inteiro: ");
                        valor=input.nextInt();
                        Numero numero=new Numero(valor);
                        System.out.println("\nO fatorial de "+ valor + " é " + numero.calcularFatorial());
                        System.out.println("\n\nPara outro número digite '1' ou pressione qualquer outra tecla para voltar ...");
                        escolha = input.nextInt();
                        if (escolha != 1) {
                            contFunction = false;
                        }
                    }
                    break;


                default:
                    contMain = false;
                    break;
            }

        } while(contMain==true);
    }
}