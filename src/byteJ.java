import java.util.Scanner;

public class byteJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 128;
        for (int i = 0; i < 8; i++) {
            if ((a ^ x) < a)
            {
                System.out.print("1");
            } else{
                System.out.print("0"  );
            }
            x>>=1;
        }
    }
}
