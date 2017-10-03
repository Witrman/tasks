import java.util.Scanner;
public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =sc.nextInt();
        int hours = sum/60;
        int minuts = sum%60;
        while (hours>=24)
        {
            hours-=24;
        }


        System.out.println(hours+" "+minuts);
    }
}
