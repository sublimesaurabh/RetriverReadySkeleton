//Saurabh Chapagain
//Date: April 26, 2022.
//s205@umbc.edu

public class LabEight {
    public static void main(String[] args) {
        //Creating object of Area class, giving Area class arguments to pass to constructor
        Area areaObject = new Area(10,15);

        //Calling relevant methods from Area class, and printing to console
        System.out.println("The area of the rectangle is " + areaObject.getAreaOfRectangle());
        System.out.println("The perimeter of the rectangle is " + areaObject.getPerimeter());
    }
}
