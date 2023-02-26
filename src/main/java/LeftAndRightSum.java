import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= Integer.parseInt(scanner.nextLine());

        int leftSum= 0;
        int rightSum= 0;

        for (int i = 0; i <number ; i++) {
            int num= Integer.parseInt(scanner.nextLine());
            leftSum+=num;
        }

        for (int i = 0; i <number ; i++) {
            int num2= Integer.parseInt(scanner.nextLine());
            rightSum+=num2;
        }
        if (leftSum == rightSum){
            System.out.printf(" Yes, sum = %d ", leftSum);
            }
        else {
            System.out.printf(" No, diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}
