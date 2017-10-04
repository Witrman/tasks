import java.util.Scanner;

public class arifB_C_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
     int y= x*x;
       y = y*y;
        System.out.println("степень 4="+y);
        y= x*x;
        y = y*y*y;
        System.out.println("степень 6="+y);
        y= x*x;
        y = y*y*y*x;
        System.out.println("степень 7="+y);
        y= x*x;
        y = y*y*y*x;
        y = y*y*y;
        System.out.println("степень 21="+y);
    }
}
