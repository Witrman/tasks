import java.util.Scanner;

public class byteE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        byte b = sc.nextByte();
        int x = 1;
        int s = a | (x<<b);
        System.out.println(s);
    }
}
