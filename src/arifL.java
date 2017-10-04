import java.util.Scanner;

public class arifL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i=0;i < nums.length; i++){
            nums[i]=sc.nextInt();
        }
        double x= (((nums[1]*60)+40)*100)/3600;
        System.out.println((nums[0]*30)+(30*(x/10))/10);
    }
}
