import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Conta {

    String numeroConta;
    String donoConta;
    Double saldo;
    Double credito;
    boolean valida;
    boolean retorno;
    String senha;
    String tipoConta;
    

    public Conta (String numeroConta, String donoConta, Double saldo, Double credito){
        this.numeroConta = numeroConta;
        this.donoConta = donoConta;
        this.saldo = saldo;
        this.credito = credito;
    }
    public Conta(){

    }

    public void criarConta (Double credito, String tipoConta){

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

        Random rand = new Random();

        int num = rand.nextInt(9999999);
        numeroConta = Integer.toString(num);

        System.out.println("Criando conta");
        for (int x = 0; x <= 2; x++){
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\t\t.");      
        }
        System.out.println("Criada a seguinte conta: ");
        System.out.println("Nome do cliente: "+donoConta);
        System.out.println("Tipo de conta: "+tipoConta);
        System.out.println("Saldo em conta: "+saldo);
        System.out.println("Crédito disponível: "+credito);
        System.out.println("Número da conta (gerado pelo sistema): "+num);
        System.out.println("A senha inserida foi >>> "+senha+" <<<");        

    } 

    public void depositar(Double deposito){
        this.saldo = this.saldo + deposito;
    }

    public void sacar(Double saque){
        this.saldo = this.saldo - saque;
    }

    public double extrato(){
        return saldo;
    }
    
    public void imprimeDados(){
        System.out.println("O nome do titular da conta é "+donoConta);
        System.out.println("Seu número da conta é "+numeroConta);
        System.out.println("Tipo da conta: "+tipoConta);
        System.out.println("O saldo da conta é de R$ "+saldo);
        System.out.println("O crédito disponível para esta conta é "+credito);
    }

}