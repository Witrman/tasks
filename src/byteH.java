import java.util.Scanner;

public class byteH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        x= (x<<b)-1;

        System.out.println(a&x);
    }
}

