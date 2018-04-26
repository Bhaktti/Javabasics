import java.util.ArrayList;
import java.util.Scanner;

public class TestMatchword {

    public static void main (String[] args) {
        String sentence1 = new String();
        String sentence2 = new String();
        String sentence3 = new String();
        String sentence4 = new String();
        String sentence5 = new String();

        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter Sentence 1: ");

        sentence1 = user_input.nextLine();


        System.out.println("Enter Sentence 2: ");

        sentence2 = user_input.nextLine();


        System.out.println("Enter Sentence 3: ");

        sentence3 = user_input.nextLine();

        System.out.println("Enter Sentence 4: ");

        sentence4 = user_input.nextLine();

        System.out.println("Enter Sentence 5: ");

        sentence5 = user_input.nextLine();



        ArrayList<String> search1 = new ArrayList<String>();
        search1.add(sentence1);
        search1.add(sentence2);
        search1.add(sentence3);
        search1.add(sentence4);
        search1.add(sentence5);

        System.out.println(search1);

      //ArrayList.set(search1);

            MatchWord.match(search1);






    }
}
