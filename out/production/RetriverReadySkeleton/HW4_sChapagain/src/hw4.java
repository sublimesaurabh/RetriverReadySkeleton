// Saurabh Chapagain
// Date: April 27, 2022.
// s205@umbc.edu

public class hw4 {

    public hw4(){
        super();
        System.out.println("Default constructor");
    }

    public hw4(String str){
        this();
        //It will call a default constructor
        System.out.println("Parametrized constructor with String param");
    }

    public hw4(String str, int num) {
        this(str);
        //It will call the constructor with String argument
        System.out.println("Parametrized constructor with double args");
    }

    public hw4(int num1, int num2, int num3){
        this("saurabh", 2);
        // It will call the constructor with (String, integer) arguments
        System.out.println("Parametrized constructor with three args");
    }

}


