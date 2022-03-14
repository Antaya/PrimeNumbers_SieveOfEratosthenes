import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number.");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(n);

        boolean[] prime = new boolean[n + 1]; // булевый массив от 0 до n

        for (int i = 0; i < n; i++) {

            prime[i] = true; // все значения инициализируем как true
        }


        for (int p = 2; p * p <= n; p++) {//первое простое число - 2, квадратный корень простого числа
            // не превышает, либо равно заданному числу n

            if (prime[p] == true) ;

            for (int i = p * 2; i <= n; i += p) // все кратные p - false

                prime[i] = false;
        }

        // Распечатать все простые числа

        for (int i = 2; i <= n; i++) {

            if (prime[i] == true)

                System.out.print(i + " ");

        }

    }
}
