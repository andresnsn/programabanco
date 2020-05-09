import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Aqui, alguns recursos globais.

        Integer opcao = 9;
        String conta;
        String senha;
        int opcaoConta = 9;
        Scanner input = new Scanner(System.in);

        Conta contanormal = new Conta();
        Conta contapoupanca = new Conta();
        Conta contavip = new Conta();
     
        // Aqui apenas uma apresentação básica.

        System.out.println("\n\n-----Bem vindo ao Nipo Bank-----\n\n");
        System.out.println("Primeiro precisamos abrir sua conta! \n");
        System.out.println("Aperte enter para começar");
     
        // Esta parte aqui apenas vai entender um "Enter" para o programa seguir rodando.
        // Se o input for vazio, ele não vai fazer nada, mas caso seja pressionado um enter, vai seguir rodando.

        String enter = input.nextLine();
        if(!enter.equals("") ) {}

        // Aqui o programa aciona o método criarConta, passando valores únicos para essa conta, dependendo da opção selecionada.
        // Logo em seguida, o método usarConta é acionado para possibilitar ao usuário mexer na conta que acabou de criar.

        do {
            System.out.println("Selecione uma destas opções:\n1- Conta normal\n2- Conta poupança\n3- Conta 5 estrelas\n0- Sair");
            opcaoConta = input.nextInt();

            if (opcaoConta == 1) {            
                if (contanormal.criada == false){
                    String tipoConta = "Conta normal";
                    Double credito = 100.00;
                    Boolean criada = true;
                    contanormal.criarConta(credito, tipoConta, criada);
                    contanormal.usarConta();
                } else {contanormal.handleAccount();}
            }
                      
    
            else if (opcaoConta == 2) {
                    
                if (contapoupanca.criada == false){
                    String tipoConta = "Conta poupança";
                    Double credito = 0.00;
                    Boolean criada = true;
                    contapoupanca.criarConta(credito, tipoConta, criada);
                    contapoupanca.usarConta();
                } else {contapoupanca.handleAccount();}
                
            }
            else if (opcaoConta == 3) {
                
                if (contavip.criada == false){
                    Double credito = 500.00;
                    String tipoConta = "Conta 5 estrelas";
                    Boolean criada = true;
                    contavip.criarConta(credito, tipoConta, criada);
                    contavip.usarConta();
                } else {contavip.handleAccount();} 
                
            } 
        
            } while (opcaoConta != 0);
                    
        
    }
}
    

    







        
            

            