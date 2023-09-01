import java.util.Scanner;

public class b16 {
    public static void main(String[] args) {
        System.out.println("Nhập số a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số b: ");
        int b = new Scanner(System.in).nextInt();
        for (int i = 1; i <= a/2 && i <= b/2; i++) {
            if (a % i == 0 || b % i == 0) {
            } else {
                System.out.println("a, b số là hai số nguyên tố cùng nhau");
                return;
            }
        }

    }
}
