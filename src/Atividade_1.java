import java.util.Scanner;

//1. Elabore um algoritmo que leia dois números e mostre a soma deles.
public class Atividade_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo, sum;

        System.out.println("enter number one: ");
        numberOne = scanner.nextInt();
        System.out.println("enter number two: ");
        numberTwo = scanner.nextInt();

        sum = numberOne + numberTwo;

        System.out.println(" the result is: " +sum);

    }
}
    