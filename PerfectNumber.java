import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the  number : ");
        n = kb.nextInt();

        System.out.println("The positive divisors  : ");

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }

        System.out.println("The sum of the divisors is : " + sum);

        if (sum == n) {
            System.out.println("The number is perfect.");
        } else {
            System.out.println("The number is not perfect.");
        }
    }
}
