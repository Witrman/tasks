import java.util.Scanner;

public class arifI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str =sc.nextLine().toCharArray();
        int sum = str[0]-48 + str[1]-48 + str[2]-48;
        System.out.println(sum);

    }
}
