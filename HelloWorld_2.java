public class HelloWorld_2 {

    //* Object Orientation -> Method

    static void sayHello(){ //! To create a method called "sayHello"
        System.out.println("Hello world"); 
    }
    static void sayHi(String name){
        System.out.println("Hi " + name);
    }
    static int sum(int val1, int vql2){  //! Don't use"void", it means that main does not return anything
        return val1+vql2;
    }
    static int max(int a, int b){
        if(a>b){
            return a;
        } else{
            return b;
        }
    }

    //* Object Orientation -> Creating object
    void bark(){
        System.out.println("Woof-Woof");
    }


    /* To Understand, let's take a look at the main method
    The main method takes an array of Strings 
    as its parameters, and does not return a value. */
    public static void main(String[] args){  //* (Main method)

        //* Object Orientation -> Method
        sayHello(); //! To call a method, type its name with parenthesis

        sayHi("David");

        int x = sum(10928, 12736);
        System.out.println(x);

        int Max = max(342, 786);
        System.out.println(Max);


    }
}

//* Object Orientation -> Creating object
class myClass{
    public static void main(String[] args){
        HelloWorld_2 dog = new HelloWorld_2();
        dog.bark();
    }
}


