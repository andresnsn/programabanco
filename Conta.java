import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Conta {

    String numeroConta;
    String donoConta;
    Double saldo = 0.0;
    Double credito;
    String senha;
    String tipoConta;
    int opcao = 9;
    Boolean criada = false;
    String conta;
    int option;
    
    public Conta (String numeroConta, String donoConta, Double saldo, Double credito){
        this.numeroConta = numeroConta;
        this.donoConta = donoConta;
        this.saldo = saldo;
        this.credito = credito;
    }
    public Conta(){

    }
    /* Quando este método é acionado, começa a interagir com o usuário e gravar informações no objeto. */

    public void criarConta (Double credito, String tipoConta, Boolean criada){

        Scanner input = new Scanner(System.in);
        Scanner inputsenha = new Scanner(System.in);
 
        System.out.println("Digite o seu nome: ");
        this.donoConta = input.nextLine();
        System.out.println("Quanto saldo você irá depositar?");
        this.saldo = input.nextDouble();
        this.credito = credito;
        this.tipoConta = tipoConta;
        System.out.println("Insira uma senha para sua conta:");;
        this.senha = inputsenha.nextLine();
        this.criada = criada;

        // Aqui é onde o número da conta é criado randomicamente.

        Random rand = new Random();

        // Aqui ele converte o número randômico de um Int para uma String.

        int num = rand.nextInt(9999999);
        numeroConta = Integer.toString(num);

        // Aqui é um código só para gerar 3 pontos na tela, simulando um "loading", na criação da conta.
        // Ele executa a quantidade de vezes do laço FOR.

        System.out.println("Criando conta");
        for (int x = 0; x <= 2; x++){
            try {
                TimeUnit.MILLISECONDS.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\t\t.");      
        }

        // Aqui, após a criação da conta, o programa joga os dados na tela para o usuário conferir.

        System.out.println("Criada a seguinte conta: ");
        System.out.println("Nome do cliente: "+donoConta);
        System.out.println("Tipo de conta: "+tipoConta);
        System.out.println("Saldo em conta: "+saldo);
        System.out.println("Crédito disponível: "+credito);
        System.out.println("Número da conta (gerado pelo sistema): "+num);
        System.out.println("A senha inserida foi >>> "+senha+" <<<");
    } 
    // Métodos requisitados

    public void depositar(Double deposito){
        this.saldo = this.saldo + deposito;
    }

    public void sacar(Double saque){
        this.saldo = this.saldo - saque;
    }

    public double extrato(){
        return saldo;
    }

    // Método que só imprime as informações da conta na tela

    public void imprimeDados(){
        System.out.println("O nome do titular da conta é "+donoConta);
        System.out.println("Seu número da conta é "+numeroConta);
        System.out.println("Tipo da conta: "+tipoConta);
        System.out.println("O saldo da conta é de R$ "+saldo);
        System.out.println("O crédito disponível para esta conta é "+credito);
    }

    /* Esse método serve para manusear a conta, ou seja, como a conta já está criada no respectivo objeto, o usuário tem a opção
    de continuar usando ela ou criar outra no lugar */

    public void handleAccount(){
        Scanner handle = new Scanner(System.in);
        System.out.println("Deseja continuar com a mesma conta ou criar uma nova?\n1- SIM\n2- NÃO");     
        while (option != 1 && option != 2){
            option = handle.nextInt();
            if (option != 1 && option != 2){
                System.out.println("Digite uma opção válida!");
            }
            else if (option == 1){
                usarConta();
            }
            else if (option == 2){
                criarConta(credito, tipoConta, criada);
            }
        }

        
    }

    public void usarConta(){
            
        Scanner input = new Scanner(System.in);
        Scanner inputcred = new Scanner(System.in);

        // Aqui criamos um laço onde, apenas quando apertado o "0" (zero), o programa cessa. Este laço também fica repetindo o menu básico.

        while (opcao != 0){
            System.out.println("\n\nO que você quer fazer?\n\n");
            System.out.println("1- Realizar depósito\n2- Realizar saque\n3- Verificar saldo\n4- Mostrar dados da conta\n0- Voltar ao menu anterior");
            opcao = input.nextInt();

            /* Aqui, para cada opção selecionada, ele faz uma função diferente. Aqui também o programa pede que o usuário
                insira o número de sua conta e senha para realizar a função, caso contrário, informa que há algo errado
                e só funciona se você colocar corretamente o número da conta e senha.
                O número da conta é criado automaticamente com um código na classe Conta, e a senha o usuário pode inserir
                na criação da conta */

            if (opcao == 1){
                do {
                    
                    System.out.println("Digite o número da sua conta: ");
                    conta = inputcred.nextLine();
                    System.out.println("Digite a sua senha: ");
                    senha = inputcred.nextLine();
                    if (numeroConta.equals(conta) && senha.equals(senha)){
                        System.out.println("\n\nQuanto você quer depositar?");
                        Double deposito = input.nextDouble();
                        depositar(deposito);
                        System.out.println("\n\nDepósito realizado com sucesso!\nSeu novo saldo é R$"+saldo);
                    } else {
                        System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                    }
                    opcao = 9;
                } while (!numeroConta.equals(conta) && senha.equals(senha)); System.out.println(conta);
                }



            else if (opcao == 2) {
                do {
                    System.out.println("Digite o número da sua conta: ");
                    conta = inputcred.nextLine();
                    System.out.println("Digite a sua senha: ");
                    senha = inputcred.nextLine();
                    if (numeroConta.equals(conta) && senha.equals(senha)){
                        System.out.println("\n\nQuanto você quer sacar?");
                        Double saque = input.nextDouble();
                        sacar(saque);
                        System.out.println("\n\nSaque realizado com sucesso!\nSeu novo saldo é R$ "+saldo);
                    } else {
                        System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                    }
                    opcao = 9;
                } while (!numeroConta.equals(conta) && !senha.equals(senha));
                    
                }
            

            else if (opcao == 3) {
                do {
                    System.out.println("Digite o número da sua conta: ");
                    conta = inputcred.nextLine();
                    System.out.println("Digite a sua senha: ");
                    senha = inputcred.nextLine();
                    if (numeroConta.equals(conta) && senha.equals(senha)){
                        System.out.println("\n\nSeu saldo é R$ "+extrato());
                    } else {
                        System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                    }
                    opcao = 9;
                } while (!numeroConta.equals(conta) && !senha.equals(senha));

            }


            else if(opcao == 4){
                do {
                    System.out.println("Digite o número da sua conta: ");
                    conta = inputcred.nextLine();
                    System.out.println("Digite a sua senha: ");
                    senha = inputcred.nextLine();
                    if (numeroConta.equals(conta) && senha.equals(senha)){
                        imprimeDados();
                    } else {
                        System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                    } 
                    opcao = 9;
                } while (numeroConta.equals(conta) && !senha.equals(senha));

        } 

            // Quebra o laço de repetição
            
            else if (opcao == 0){
                opcao = 9;
                break;
                } 
            
        }
    }
}
    
