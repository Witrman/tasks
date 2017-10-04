import java.util.Scanner;

public class byteD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        System.out.println((x<<a)+(x<<b));
    }
}
