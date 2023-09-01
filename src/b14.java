import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        System.out.println("nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        for (int i= 1; i<=n; i++){
            if (i%7==0){
                s =s +i;
            }
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn n và chia hết cho 7 là: "+s);
    }
}
