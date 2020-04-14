import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputcred = new Scanner(System.in);
        Integer opcao = 9;
        String conta;
        String senha;
        
        System.out.println("\n\n-----Bem vindo ao Nipo Bank-----\n\n");
        System.out.println("Primeiro precisamos abrir sua conta! \n");
        System.out.println("Aperte enter para abrir sua conta");

        Conta novaconta = new Conta();
     
        String enter = input.nextLine();
        if( !enter.equals("") ) {}
        
        else{
            
            System.out.println("Qual tipo de conta você quer criar?\n1- Conta normal\n2- Conta poupança\n3- Conta 5 estrelas");
            int opcaoConta = input.nextInt();

            if (opcaoConta == 1) {              
                Double credito = 100.00;
                String tipoConta = "Conta normal";
                novaconta.criarConta(credito, tipoConta);

            } else if (opcaoConta == 2) {
                Double credito = 0.00;
                String tipoConta = "Conta poupança";
                novaconta.criarConta(credito, tipoConta);

            } else if (opcaoConta == 3) {
                Double credito = 500.00;
                String tipoConta = "Conta 5 estrelas";
                novaconta.criarConta(credito, tipoConta);
            }


            



            while (opcao != 0){
                System.out.println("\n\nO que você quer fazer?\n\n");
                System.out.println("1- Realizar depósito\n2- Realizar saque\n3- Verificar saldo\n4- Mostrar dados da conta\n0- Sair");
                opcao = input.nextInt();

                if (opcao == 1){
                    do {
                        
                        System.out.println("Digite o número da sua conta: ");
                        conta = inputcred.nextLine();
                        System.out.println("Digite a sua senha: ");
                        senha = inputcred.nextLine();
                        if (novaconta.numeroConta.equals(conta) && novaconta.senha.equals(senha)){
                            System.out.println("\n\nQuanto você quer depositar?");
                            Double deposito = input.nextDouble();
                            novaconta.depositar(deposito);
                            System.out.println("\n\nDepósito realizado com sucesso!\nSeu novo saldo é R$"+novaconta.saldo);
                        } else {
                            System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                        }
                        opcao = 9;
                    } while (!novaconta.numeroConta.equals(conta) && !novaconta.senha.equals(senha)); System.out.println(conta);
                    }
    
    
    
                else if (opcao == 2) {
                    do {
                        System.out.println("Digite o número da sua conta: ");
                        conta = inputcred.nextLine();
                        System.out.println("Digite a sua senha: ");
                        senha = inputcred.nextLine();
                        if (novaconta.numeroConta.equals(conta) && novaconta.senha.equals(senha)){
                            System.out.println("\n\nQuanto você quer sacar?");
                            Double saque = input.nextDouble();
                            novaconta.sacar(saque);
                            System.out.println("\n\nSaque realizado com sucesso!\nSeu novo saldo é R$ "+novaconta.saldo);
                        } else {
                            System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                        }
                        opcao = 9;
                    } while (!novaconta.numeroConta.equals(conta) && !novaconta.senha.equals(senha));
                        
                    }
                
    
                else if (opcao == 3) {
                    do {
                        System.out.println("Digite o número da sua conta: ");
                        conta = inputcred.nextLine();
                        System.out.println("Digite a sua senha: ");
                        senha = inputcred.nextLine();
                        if (novaconta.numeroConta.equals(conta) && novaconta.senha.equals(senha)){
                            System.out.println("\n\nSeu saldo é R$ "+novaconta.extrato());
                        } else {
                            System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                        }
                        opcao = 9;
                    } while (!novaconta.numeroConta.equals(conta) && !novaconta.senha.equals(senha));
    
                }
    
    
                else if(opcao == 4){
                    do {
                        System.out.println("Digite o número da sua conta: ");
                        conta = inputcred.nextLine();
                        System.out.println("Digite a sua senha: ");
                        senha = inputcred.nextLine();
                        if (novaconta.numeroConta.equals(conta) &&!novaconta.senha.equals(senha)){
                            novaconta.imprimeDados();
                        } else {
                            System.out.println("\n\nNúmero da conta ou senha incorretos!\nTente novamente.");
                        } 
                        opcao = 9;
                    } while (!novaconta.numeroConta.equals(conta) && !novaconta.senha.equals(senha));
    
            } 
    
            
                else if (opcao == 0){
                    break;
                    } 
                
            }
                
            
                    
                
            
            
            
            
            }
            



        }
    
}






        
            

            