import java.util.Scanner;

public class b9{
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            int num_space = (n-i);
            for (int j = 1; j <= num_space; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
