import java.util.*;

public class UserInput {


    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter number");

        int number = user_input.nextInt();

        switch(number) {
            case 1 :
                System.out.println("it is Monday today");
                break;
            case 2 :
                System.out.println("it is Tuesday today");
                break;
            case 3 :
                System.out.println("it is wednesday today");
                break;
            case 4 :
                System.out.println(" it is Thursday today");
                break;
            case 5 :
                System.out.println(" it is Friday today;");
                break;
            case 6 :
                System.out.println(" it is Saturday today;");
                break;
            case 7 :
                System.out.println(" it is Sunday today;");
                break;
            default :
                System.out.println("Invalid input");
        }

    }

}
