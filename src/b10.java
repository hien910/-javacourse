import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        System.out.println("Nhập h: ");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <= h; i++) {
            int num_space = h;
            for (int j = 1; j <= (2 * num_space) - 2*i; j++){
                System.out.print(" ");
//                num_space = num_space-1;

            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
                if (j>1){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

    }
}

