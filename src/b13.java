import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        System.out.println("nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        double s = 0;
        int i = 1;
        while (i <=n){
            s= s+ 1.0/i;
            i++;
        }

//        for (int i = 1; i <= n; i++){
//            s = s + 1/i;
//
//        }
        System.out.println(s);
    }
}
