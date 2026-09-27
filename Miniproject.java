import java.util.Scanner;
public class Miniproject {
    public static void main(String [] args) {
        //MINI PROJECT
        Scanner sc=new Scanner (System.in);
        int myNumber=(int)(Math.random()*100);
        int userNumber=0;
        do {
           System.out.println("Guess my number(1-100): ");
           userNumber=sc.nextInt();
           if(userNumber==myNumber) {
               System.out.println("Correct! You guessed my number");
           } else if (userNumber < myNumber) {
               System.out.println("Your guess is too low");
           } 
           else {
               System.out.println("Your guess is too high");
        } while (userNumber != myNumber);
           System.out.print("My number was: ");
           System.out.println(myNumber);
        }

        


    }
}

   