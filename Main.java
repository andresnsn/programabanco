import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Aqui nós inicializamos recursos globais. Instanciamos o scanner duas vezes porque em determinado momento uma única instância não funciona mais, um tipo de bug.
        /* Inicializamos a variável "opcao" com um wrapper Integer, pois no começo necessitamos usar null nessa variável. Depois de alguns problemas com null, o trocamos para
        um número randômico só para fazer funcionar, deixando o "9". Podemos aprimorar isso, se necessário.*/

        Scanner input = new Scanner(System.in);
        Scanner inputcred = new Scanner(System.in);
        Integer opcao = 9;
        String conta;
        String senha;
        

        // Aqui apenas uma apresentação básica, e então já instanciamos um novo objeto chamado "novaconta".

        System.out.println("\n\n-----Bem vindo ao Nipo Bank-----\n\n");
        System.out.println("Primeiro precisamos abrir sua conta! \n");
        System.out.println("Aperte enter para abrir sua conta");

        Conta novaconta = new Conta();
     
        // Esta parte aqui apenas vai entender um "Enter" para o programa seguir rodando.
        // Se o input for vazio, ele não vai fazer nada, mas caso seja pressionado um enter, vai seguir rodando.

        String enter = input.nextLine();
        if(!enter.equals("") ) {}
        
        else{
            // Aqui o programa aciona o método criarConta, passando valores únicos para essa conta, dependendo da opção selecionada.

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


            


            // Aqui criamos um laço onde, apenas quando apertado o "0" (zero), o programa cessa. Este laço também fica repetindo o menu básico.

            while (opcao != 0){
                System.out.println("\n\nO que você quer fazer?\n\n");
                System.out.println("1- Realizar depósito\n2- Realizar saque\n3- Verificar saldo\n4- Mostrar dados da conta\n0- Sair");
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
    
                // Quebra o laço de repetição
                
                else if (opcao == 0){
                    break;
                    } 
                
            }
                
            
                    
                
            
            
            
            
            }
            



        }
    
}






        
            

            