import java.util.Scanner;

public class b8{
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i ==  1 || i == n){
                    System.out.print("*");
                }else{
                    if (j == 1 || j == m){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.print("\n");
        }

    }
}
