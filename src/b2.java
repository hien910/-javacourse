import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int a = 0;
        for (int i = 1; i<=n; i++){
            if (n % i == 0){
                a = a +1;
            }
        }
        System.out.println("Số ước của n là: "+a);
    }
}
