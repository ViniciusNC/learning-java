import java.util.Scanner;

public class teste01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
    System.out.println("Digite o primeiro número: ");
    num1 = input.nextInt();

    System.out.println("Digite o segundo número: ");
    num2 = input.nextInt();

    sum = num1 + num2;

    System.out.printf("A soma é %d", sum);
    }
}
