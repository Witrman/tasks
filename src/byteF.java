import java.util.Scanner;

public class byteF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        int s;
        if ((a | (x<<b))<a)
        {
            s =(a | (x<<b));
        }
        else
        {
            s =(a ^ (x<<b));
        }
        System.out.println(s);
    }
}
