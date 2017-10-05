import java.util.Scanner;

public class byteG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        if ((a ^ (x<<b))<a)
        {
            a =(a ^ (x<<b));
        }
        System.out.println(a);
    }
}

