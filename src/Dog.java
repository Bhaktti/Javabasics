public class Dog {

    String name ;

    public static void main (String[] args){
       //make a doc object to access this name variable

       Dog dog1 = new Dog();
       //dog1.bark();
       dog1.name = "Bart";

       //Now create a dog array

        Dog[] mydogs = new Dog[3];
        //put some dogs in it

        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;

        //now access the dogs using array refrences
        mydogs[0].name = "freida";
        mydogs[1].name = "stella ";
        System.out.println("last dogs name is"+ mydogs[2].name);

        //looping through the array

        int x = 0;
        while (x<mydogs.length){

            mydogs[x].bark();
            x=x+1;

        }


    }

    private void bark() {
        System.out.println(name + " says Ruff !");

    }
}
