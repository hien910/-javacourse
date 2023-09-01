import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0, s1 = 0, s2 = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
            if (i % 2 == 0) {
                s2 = s2 + i;
            } else {
                s1 = s1 + i;
            }
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn n: "+s);
        System.out.println("Tổng các số tự nhiên lẻ không lớn hơn n: "+s1);
        System.out.println("Tổng các số tự nhiên chẵn không lớn hơn n: "+s2);

    }
}
