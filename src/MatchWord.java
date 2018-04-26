import java.util.*;

public class MatchWord {


        public static void match(ArrayList<String> list1 ){
            boolean status=false;

            do {
                Scanner user_input = new Scanner(System.in);
                int count=0;

                System.out.println("Enter the word you want yo find: ");

                String word = user_input.next();
                for (String str: list1){
                    boolean found =Arrays.asList(str.split(" ")).contains(word);
                    if(found)
                    {
                        count++;
                    }
                }

                if (count>0){

                    System.out.println("Match found " );
                }
                else{
                    System.out.println("Not found!");
                }
                System.out.println("Do you want to continue searching? y/n");
                Scanner u_ip = new Scanner(System.in);
                String ip = u_ip.next();
                if (ip.equalsIgnoreCase("y")){
                    status= true;
                }
                else if (ip.equalsIgnoreCase("n")){
                    status = false;
                }

            }while(status);






        }
}


