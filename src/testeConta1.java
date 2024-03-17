import java.util.Scanner;

public class testeConta1 {
    public static void main(String[] args){
        String name;

        Scanner input = new Scanner(System.in);

        Conta1 minhaConta = new Conta1();

        System.out.printf("O nome inicial é %s%n ", minhaConta.getName());

        System.out.println("Por favor entre com o nome: ");
        name = input.nextLine();
        minhaConta.setName(name);

        System.out.println();

        System.out.printf("O nome do objeto em minhaConta é: %s%n", minhaConta.getName());
    }
}
