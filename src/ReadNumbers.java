import java.util.Scanner;

public class ReadNumbers {

    public static void main (String [] args){

        Scanner input =  new Scanner (System.in);

        System.out.println("Read user input");

        int num = input.nextInt();
        input.close();
        System.out.println("The number entered by user is" + num);
    }
}
