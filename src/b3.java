import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyên b: ");
        int b = new Scanner(System.in).nextInt();
        int c = 0;
        for (int i=1; i<=a && i<=b; i++){
            if (a %i==0 && b%i==0){
                c=i;
            }
        }
        System.out.println(c);

        int d = (a>b) ? a: b;
        while (true){
            if (d % a==0 && d%b==0){
                System.out.println(d);
                break;
            } else {
                d++;
            }

        }

    }
}
