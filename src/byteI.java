import java.util.Scanner;

public class byteI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        x<<=b;
        if ((a ^ x)  <  a)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
