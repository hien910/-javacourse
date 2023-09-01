import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        System.out.println("Nhập các số a, b ,c ,d lần lượt là: ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();
        if (a > b && a > c && a>d){
            System.out.println("Số lớn nhất là a: "+ a);
        }else if (b>a && b>c && b>d){
            System.out.println("Số lớn nhất là b: "+ b);
        }else if (c>a && c>b && c>d) {
            System.out.println("Số lớn nhất là c: " + c);
        }else if (d>a && d>c && d>b) {
            System.out.println("Số lớn nhất là d: " + d);
        }

    }
}
