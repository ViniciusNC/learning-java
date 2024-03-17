import java.util.Scanner;

public class testeConta2 {
    public static void main(String[] args){
        Conta2 suaConta = new Conta2();

        String nome;


        Scanner input = new Scanner(System.in);

        System.out.printf("O nome inicial é %s%n ", suaConta.getNome());

        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        suaConta.setNome(nome);

        System.out.println();


        System.out.printf("O nome digitado foi :  %s%n", suaConta.getNome());


    }
}
