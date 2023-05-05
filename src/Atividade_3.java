import java.util.Scanner;

//3. Desenvolva um algoritmo que receba dois valores numéricos inteiros,
// calcule e mostre a soma do quadrado desses dois números.
public class Atividade_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1, v2, q1, q2, sum;
        System.out.println("enter the value n1 ");
        v1 = scanner.nextInt();
        System.out.println("enter the value n2 ");
        v2 = scanner.nextInt();

        q1 = v1 * v1;
        q2 = v2 * v2;

        sum = q1 + q2;
        System.out.println("the result of the sum of squares is "+sum);


    }

}
