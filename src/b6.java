import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        while (n!=0){
            s = s + n%10;
            n = n/10;
        }
//        for (int i = 1; i<=n; i++){
//            s = s + n%10;
//            n = n/10;
//        }
        System.out.println(s);
    }
}
