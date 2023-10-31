import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start integer: ");
        int start = input.nextInt();
        System.out.print("Enter end integer:");
        int end = input.nextInt();
        if(start > end) {
            System.out.println("Error:start number should bigger than the end number");
        }
        else {
            int sum =0;
            int i = start;
            while (i <= end) { 
                sum += i;
                i++;
            }
            System.out.println("The sum is " + sum);
        }
        input.close();
    }
}
