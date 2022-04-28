//Saurabh Chapagain
//Date: April 26, 2022.
//s205@umbc.edu

public class Area {
    //Attributes of Area class
     double length;
     double width;

     //default constructor
    public Area(){
        length = 0;
        width = 0;
    }

    //Constructor with parameters
    public Area (double length, double width){
        this.length = length;
        this.width = width;
    }

    // getter and setter methods for attributes width and length,

    public void setLength(double length){
        this.length = length;
    }

    public double getLength (){
       return length;
    }

    public void setWidth (double width){
        this.width = width;
    }

    public  double getWidth (){
        return width;
    }

    // method to return calculated area of rectangle
    public double getAreaOfRectangle (){
        return length * width;
    }

    // method to return perimeter of rectangle
    public double getPerimeter (){
        return 2 * (length + width);
    }

}


