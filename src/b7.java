import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
}
