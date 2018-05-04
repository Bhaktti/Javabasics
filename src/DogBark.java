public class DogBark {
    int size;
    String name ;

    void bark(){
        if (size > 60){
            System.out.println("Woof Woof");
        } else if (size  >14){
            System.out.println("Ruff Rufff");
        } else{
            System.out.println("Yip , Yip");
        }
    }
}
