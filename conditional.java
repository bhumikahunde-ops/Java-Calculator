import java.util.Scanner;
public class conditional {
    public static void main(String [] args) {
        //conditional
        Scanner sc=new Scanner(System.in);
        //pen=10;notebook=40;
        {
            System.out.println("Enter your cash");
        }
        int cash=sc.nextInt();
            
        if (cash<10) {
            System.out.println("You cannot buy anything");
            System.out.println("Get more cash");
        }
        else if (cash>=10 && cash<40) {
            System.out.println("You can buy pen");
        }
        else if (cash>=40 && cash<50) {
            System.out.println("You can buy notebook");

        }      
        else if (cash>=50) {
            System.out.println("You can buy both pen and notebook");
        }
        else {
            System.out.println("You cannot buy anything");
        }
    }
}
