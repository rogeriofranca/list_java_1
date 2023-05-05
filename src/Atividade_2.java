import java.util.Scanner;

//2. Construa um algoritmo que leia 4 notas e mostre a média.
public class Atividade_2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double n1, n2, n3, n4, media;
        System.out.println("enter the first n1 ");
        n1 = scanner.nextDouble();
        System.out.println("enter the second n2 ");
        n2 = scanner.nextDouble();
        System.out.println("enter the third n3 ");
        n3 = scanner.nextDouble();
        System.out.println("enter the fourth n4 ");
        n4 = scanner.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("your average is "+media);
    }
}
