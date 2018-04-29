import java.util.Scanner;

public class EvenOdd {

    public static void main (String [] args){

        int num ;

        System.out.println("Enter an integer number");

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        if (num % 2 ==0)

            System.out.println("Its an even number");

            else


            System.out.println("Its an odd number");



    }
}
