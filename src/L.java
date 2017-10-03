import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =sc.nextInt();
        int hours = sum / 60/60;
        int minute =( sum-hours*3600) / 60;
        int seconds = sum-hours*3600-minute* 60;
        while (hours>=24)
        {
            hours-=24;
        }

        System.out.format("%d:%02d:%02d", hours,minute,seconds);

    }
}
