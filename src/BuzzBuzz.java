import java.util.Scanner;
public class BuzzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter value of A: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter value of B: ");
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println(FizzBuzz(a, b, n));
        scan.close();
    }
    public static String FizzBuzz(int a, int b, int n){
        String output = "";
        for(int i = 1; i <= n; i++) {
            if ((i % a == 0) && (i % b) == 0) {
                output += "BirdBuzz";
            } else if (i % a == 0) {
                output += "Burd";
            } else if (i % b == 0) {
                output += "Buzz";
            } else {
                output += i;
            }
            output += "\n";
        }
        return output;
    }
}
