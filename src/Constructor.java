public class Constructor {

    String name;

    Constructor(){

        this.name = "I am trying to learn something";

    }

    public static void main(String args[]){
        Constructor mycon = new Constructor();
        System.out.println (mycon.name);
    }
}
