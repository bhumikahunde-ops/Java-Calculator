import java.util.Scanner;
public class loops {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int number=5;
        do {
            System.out.println("Enter your number");
            number = sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(number);
        } while (number >= 5);
        System.out.println("THE END");
    }
}
