import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        for (int i= 0; i<n; i++){
            if (i%2==0){
                System.out.println(i+" là số chẵn");
            } else {
                System.out.println(i+" là số lẻ");
            }
        }
    }
}
